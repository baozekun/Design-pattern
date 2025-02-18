# 原型模式

## 关键点
1. 通过复制现有的实例来创建新的实例。因为是通过原有的对象创建新的对象，所以称为原型模式。
2. 原型模式是用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象。原型模式允许一个对象再创建另外一个可定制的对象，无须知道任何创建的细节。
3. 用于创建重复的对象，同时又能保证性能  
    （1）浅拷贝：只拷贝对象中的基本数据类型（8种），对于数组、容器、引用对象等都不会拷贝，只会拷贝对这些对象的引用。  
    （2）深拷贝：不仅能拷贝基本数据类型，还能拷贝那些数组、容器、引用对象（不仅拷贝对这些对象的引用，而且拷贝对象本身）。
## 核心实现
实体类实现Cloneable接口，重写clone方法
### 优点
1. 提高了性能，在需要短时间创建大量的对象和创建对象很耗时的情况下，原型模式比通过new对象大大提高了时间效率。
2. 逃避构造函数的约束。
### 缺点
1. 配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。
2. 实现原型模式每个派生类都必须实现 Clone 接口。

## 应用场景
1. 通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。比如，向数据库表插入多条测试数据，可以用到。
2. 在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过clone的方法创建一个对象，然后由工厂方法提供给调用者。