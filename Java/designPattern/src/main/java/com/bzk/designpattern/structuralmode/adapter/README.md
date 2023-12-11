# 适配器模式

client：需要使用适配器的对象，不需要关心适配器内部的实现，只对接目标角色。  
Target：目标角色，和client直接对接，定义了client需要用到的功能。  
Adaptee：需要被进行适配的对象。  
Adapter：适配器，负责将源对象转化，给client做适配。  

## 类适配器和对象适配器

类适配器：由于采用继承模式，在适配器中可以重写Adaptee原有的方法，使得适配器可以更加灵活；但是有局限性，Java是单继承模式，所以适配器类只能继承Adaptee，不能在额外继承其他类，也导致Target类只能是接口。

对象适配器：这个模式规避了单继承的劣势，将Adaptee类用引用的方式传递给Adapter，这样可以传递的是Adaptee对象本身及其子类对象，相比类适配器更加的开放；但是也正是因为这种开放性，导致需要自己重新定义Adaptee，增加额外的操作。

## 优缺点
* 调用端(Client)内部修改关闭  
* 被适配类（Adaptee）内部修改关闭  
* 被适配类扩展开放(Adapter)：适配器类扩展了被适配类，使接口名称适配后与目标接口一致  
* 解决了目标类和被适配类接口名称不一致的问题，客户类统一按目标接口中的定义的函数名称调用即可  

## Java源码中的运用
`JUC`中的`FutureTask`
```java
public class FutureTask<V> implements RunnableFuture<V> {
  private Callable<V> callable;
  
  public FutureTask(Callable<V> callable) {
    if (callable == null)
      throw new NullPointerException();
    this.callable = callable;
    this.state = NEW;       // ensure visibility of callable
  }

  public FutureTask(Runnable runnable, V result) {
    this.callable = Executors.callable(runnable, result);
    this.state = NEW;       // ensure visibility of callable
  }
}
```
在第二个构造中，`callable`是通过`Executors.callable`中的 `RunnableAdapter` 进行适配的：
```java
public class Executors {
  public static <T> Callable<T> callable(Runnable task, T result) {
    if (task == null)
      throw new NullPointerException();
    return new RunnableAdapter<T>(task, result);
  }
}
```

## 运用场景
* 因为老代码写的很烂但是很有用  
  当我们接手维护一个老项目时，难免的会出现老代码因为新需求而不合时宜的情况，但是老代码可能在长期运行的过程中已经趋于稳定，不可轻动；此时使用适配器模式就可以轻松对原有功能进行扩展。
* 对不同的外部数据做统一输出  
  比如我们对前端的返回都是统一的，但是不同的API返回给你的数据格式是不一样的，此时就可以使用适配器模式，对不同API返回的数据进行封装，返回统一风格数据格式。
