# 观察者模式（发布订阅模式）
系统中的对象之间往往存在依赖关系，一个对象的改变会导致其他对象做出相应的反应。  
发生改变的叫做目标，收到改变通知的对象称作观察者，一个目标可以有多个观察者，观察者之间没有联系，方便扩展，是一种一对多的关系。每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。  
故观察者模式又叫做`发布-订阅（Publish/Subscribe）` 模式、`模型-视图（Model/View）`模式、`源-监听器（Source/Listener）`模式。
## 对象角色

* 发布者
  主动触发
* 观察目标
  被观察的目标对象
* 观察者（订阅者）
  发布者主动调用逻辑接口，观察者与观察目标相关联，如果观察目标发生变更，则对应的观察者就会被发布者调用执行对应的逻辑。


## 优缺点
优：建立一套触发机制，解耦目标与观察者，符合开闭原则

缺：若观察者与目标直接存在循环依赖，可能导致系统崩溃

## java应用
最典型的使用，是Spring框架中的 Event 的实现。
1. 创建自定义事件
```java
import org.springframework.context.ApplicationEvent;

public class MyCustomEvent extends ApplicationEvent {

    private String message;

    public MyCustomEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
```
2. 创建一个事件发布者
```java
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher eventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void publishCustomEvent(String message) {
        MyCustomEvent customEvent = new MyCustomEvent(this, message);
        eventPublisher.publishEvent(customEvent);
    }
}
```
3. 创建一个事件监听器
```java
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<MyCustomEvent> {

    @Override
    public void onApplicationEvent(MyCustomEvent event) {
        System.out.println("Received custom event - Message: " + event.getMessage());
    }
}
```
4. 触发
```java
// 在你的业务代码中，可以随时发布自定义事件
eventPublisher.publishCustomEvent("Hello, Spring Events!");
```

## 适用场景
一个对象的改变将导致其他一个或多个对象也发生改变，但不知道具体有多少对象将发生改变；或者在系统中需要创建一个触发链。  
观察者模式可以用来实现MVC模式，观察者模式中的观察目标就是MVC模式中的模型(Model)，而观察者就是MVC中的视图(View)，控制器(Controller)充当两者之间的中介者(Mediator)。    
当模型层的数据发生改变时，视图层将自动改变其显示内容
