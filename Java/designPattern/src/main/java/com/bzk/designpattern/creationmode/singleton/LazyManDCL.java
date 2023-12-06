package com.bzk.designpattern.creationmode.singleton;

/**
 * 单例模式
 * 高性能懒汉式
 * vilatile + 双检锁（Double-check lock）
 */
public class LazyManDCL {
    /**
     * volatile在这里发挥的作用是：禁止指令重排序
     * 实例化操作 INSTANCE = new LazyManDCL();可分为三行伪代码
     *      a:memory = allocate() //分配内存，在jvm堆中分配一段区域
     *      b:ctorInstanc(memory) //初始化对象，在jvm堆中的内存中实例化对象
     *      c:instance = memory //赋值，设置instance指向刚分配的内存地址
     * 上面的代码在编译运行时，可能会出现重排序从a-b-c排序为a-c-b。
     * 重排序是为了优化性能，但是不管怎么重排序，在单线程下程序的执行结果不能被改变
     * 保证最终一致性。而在多线程环境下，可能发生重排序，会影响结果。
     *      ① 若A线程执行到代码 INSTANCE = new LazyManDCL()时;
     *      ② 同时若B线程进来执行到代码到第一层检查 if (INSTANCE == null)
     *      ③ 当cpu切换到A线程执行代码 INSTANCE = new LazyManDCL();时发生了指令重排序，
     * 执行了a-b，没有执行c,此时的 INSTANCE 对象只有地址，没有内容。然后cpu又切换到了B线程，
     * 这时 INSTANCE == null为 false（==比较的是内存地址），
     * 则代码会直接执行到了return，返回一个未初始化的对象（只有地址，没有内容）。
     * */
    private volatile static LazyManDCL INSTANCE = null;

    private LazyManDCL() {
    }

    public static LazyManDCL getInstance(){
        /**
         * 第一层检查，检查是否有引用指向对象，高并发情况下会有多个线程同时进入
         * ①当多个线程第一次进入，所有线程都进入if语句
         * ②当多个线程第二次进入，因为 INSTANCE 已经不为null，因此所有线程都不会进入if语句，
         * 即不会执行锁，从而也就不会因为锁而阻塞，避免锁竞争
         * */
        if(INSTANCE == null){
            /**
             * 第一层锁，保证只有一个线程进入，
             *  ①多个线程第一次进入的时候，只有一个线程会进入，其他线程处于阻塞状态，
             *      当进入的线程创建完对象出去之后，其他线程又会进入创建对象，所以有了第二次if检查
             *  ②多个线程第二次是进入不到这里的，因为已被第一次if检查拦截
             **/
            synchronized (LazyManDCL.class) {
                /**
                 * 第二层检查，防止除了进入的第一个线程的其他线程重复创建对象
                 **/
                if (INSTANCE == null) {
                    INSTANCE = new LazyManDCL();
                }
            }
        }
        return INSTANCE;
    }
}
