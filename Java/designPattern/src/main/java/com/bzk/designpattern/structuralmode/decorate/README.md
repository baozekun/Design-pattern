# 装饰模式
在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。
## 四个对象

* 抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
* 具体构件（Concrete Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
* 抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
* 具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。

## 优点
* 采用装饰模式扩展对象的功能比采用继承方式更加灵活。
* 可以设计出多个不同的具体装饰类，创造出多个不同行为的组合。
## 缺点
装饰模式增加了许多子类，如果过度使用会使程序变得很复杂。

## java使用
装饰模式在 Java 语言中的最著名的应用莫过于 Java I/O 标准库的设计了。  
例如：  
* InputStream 的子类 FilterInputStream  
* OutputStream 的子类 FilterOutputStream  
* Reader 的子类 BufferedReader 以及 FilterReader  
* Writer 的子类 BufferedWriter、FilterWriter 以及 PrintWriter 等，它们都是抽象装饰类。

如下为 FileReader 为了增加缓冲区而采用装饰类 BufferedReader
```java
BufferedReader in = new BufferedReader(new FileReader("filename.txt"));
String s = in.readLine();
```
BufferedReader构造函数：
```java
public class BufferedReader extends Reader {
    //使用组合模式在装饰类 BufferedReader 中定义的 组件类：Reader 
    private Reader in;
    //装饰类中定义的扩展属性：为 Reader中的数据增加内存缓存，一个char数组
    private char cb[];
    //缓存数组的索引下标，读取缓存数据时使用
    private int nChars, nextChar;
    //默认缓存数组大小
    private static int defaultCharBufferSize = 8192;
    
    public BufferedReader(Reader in) {
        this(in, defaultCharBufferSize);
    }

    public BufferedReader(Reader in, int sz) {
        super(in);
        if (sz <= 0)
            throw new IllegalArgumentException("Buffer size <= 0");
        this.in = in;
        cb = new char[sz];
        nextChar = nChars = 0;
    }
}

```

## 应用
* 当需要给一个现有类添加附加职责，而又不能采用生成子类的方法进行扩充时。例如，该类被隐藏或者该类是终极类或者采用继承方式会产生大量的子类。
* 当需要通过对现有的一组基本功能进行排列组合而产生非常多的功能时，采用继承关系很难实现，而采用装饰模式却很好实现。
* 当对象的功能要求可以动态地添加，也可以再动态地撤销时。
