# 工厂方法模式


**工厂方法模式的注意点：**

①一句话来说就是，定义一个创建对象的接口，让子类决定实例化那个类。因为当需要增加一个新的产品时，我们需要增加一个具体的产品类和与之对应的具体子工厂，然后在具体子工厂方法中进行对象实例化，所以称为工厂方法模式。

②具体来说就是定义一个用于创建对象的工厂接口，但让实现这个工厂接口的子类来决定实例化哪个具体产品类，工厂方法让类的实例化推迟到子类中进行。

③工厂方法模式非常符合“开闭原则”，当需要增加一个新的产品时，我们只需要增加一个具体的产品类和与之对应的具体工厂即可，无须修改原有系统。同时在工厂方法模式中用户只需要知道生产产品的具体工厂即可，无须关系产品的创建过程，甚至连具体的产品类名称都不需要知道。

④虽然他很好的符合了“开闭原则”，但是由于每新增一个新产品时就需要增加两个类，这样势必会导致系统的复杂度增加。

### 优点
①用户只需要关心所需产品的对应工厂，无需关心细节

②完全支持开闭原则，提高可扩展性。所谓的开闭原则就是对扩展开放，对修改关闭，再说白点就是实现工厂方法以后要进行扩展时不需要修改原有代码，只需要增加一个工厂实现类和产品实现类就可以。这样的好处可以降低因为修改代码引进错误的风险。

### 缺点
①每加入一种产品，会创建一个具体工厂类和具体产品类，因此，类的个数容易过多，增加复杂度。

②抽象工厂和抽象产品增加了系统的抽象性和理解难度

## 工厂方法模式在Java源码中的运用
**java.util.Collection类对迭代器的实现**  

Collection(抽象工厂)
```java
public interface Collection<E> extends Iterable<E> {
    Iterator<E> iterator();
}
```
ArrayList(具体工厂）：
```java
public class ArrayList<E>{
    public Iterator<E> iterator() {
    return new Itr();
}
}
```
Iterator(抽象产品）：
```java
public interface Iterator<E> {
    boolean hasNext();
}
```
Itr（具体产品）：
```java
private class Itr implements Iterator<E> {
    int cursor; // index of next element to return
    int lastRet = -1; // index of last element returned; -1 if no such
    int expectedModCount = modCount;

    public boolean hasNext() {
            return cursor != size;
    }
    //省略代码...
}
```