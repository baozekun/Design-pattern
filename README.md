# Design-pattern
Implementation of design patterns using java and go
# 分类

**根据目的**

创建型：创建对象

结构型：处理类和对象的集合

行为型：描述类与对象怎样交互和怎样分配职责

**根据范围**

类模式：处理类和子类之间关系，编译时就确定下来了，是静态的

对象模式：处理对象之间关系的，动态的、时刻变化的

![Untitled](static/img/design_pattern_type.png)

# 关键点

**（1）创建型模式**：

- **简单工厂**：一个工厂类根据传入的参量决定创建出那一种产品类的实例。
- **工厂方法**：定义一个创建对象的接口，让子类决定实例化那个类。
- **抽象工厂**：创建相关或依赖对象的家族，而无需明确指定具体类。
- **建造者模式**：封装一个复杂对象的构建过程，并可以按步骤构造。
- **单例模式**：某个类只能有一个实例，提供一个全局的访问点。
- **原型模式**：通过复制现有的实例来创建新的实例。

**（2）结构型模式**

- **外观模式**：对外提供一个统一的方法，来访问子系统中的一群接口。
- **桥接模式**：将抽象部分和它的实现部分分离，使它们都可以独立的变化。
- **组合模式**：将对象组合成树形结构以表示“”部分-整体“”的层次结构。
- **装饰模式**：动态的给对象添加新的功能。
- **代理模式**：为其他对象提供一个代理以便控制这个对象的访问。
- **适配器模式**：将一个类的方法接口转换成客户希望的另外一个接口。
- **亨元（蝇量）模式**：通过共享技术来有效的支持大量细粒度的对象。

**（3）行为型模式模板模式**：定义一个算法结构，而将一些步骤延迟到子类实现。

- **解释器模式**：给定一个语言，定义它的文法的一种表示，并定义一个解释器。
- **策略模式**：定义一系列算法，把他们封装起来，并且使它们可以相互替换。
- **状态模式**：允许一个对象在其对象内部状态改变时改变它的行为。
- **观察者模式**：对象间的一对多的依赖关系。
- **备忘录模式**：在不破坏封装的前提下，保持对象的内部状态。
- **中介者模式**：用一个中介对象来封装一系列的对象交互。
- **命令模式**：将命令请求封装为一个对象，使得可以用不同的请求来进行参数化。
- **访问者模式**：在不改变数据结构的前提下，增加作用于一组对象元素的新功能。
- **责任链模式**：将请求的发送者和接收者解耦，使的多个对象都有处理这个请求的机会。
- **迭代器模式**：一种遍历访问聚合对象中各个元素的方法，不暴露该对象的内部结构。
