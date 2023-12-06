# 建造者模式

封装一个复杂对象的构建过程，并可以按步骤构造。因为需要对对象一步步建造起来，所以称为建造者模式。  
将复杂产品的构建过程封装分解在不同的方法中，使得创建过程非常清晰，能够让我们更加精确的控制复杂产品对象的创建过程，同时它隔离了复杂产品对象的创建和使用，使得相同的创建过程能够创建不同的产品。但是若内部变化复杂，会有很多的建造类。

## 关键点
1. 一个复杂需要分步骤组装的实体
2. 一个抽象建造者 Builder
3. 一个具体实现的建造者 BuilderImpl
4. 一个指挥者 Director 调用建造者的方法步骤来构筑实体对象


## 优点
1、建造者独立，易扩展。将复杂产品的构建过程封装分解在不同的方法中，使得创建过程非常清晰，能够让我们更加精确的控制复杂产品对象的创建过程。  
2、便于控制细节风险。它隔离了复杂产品对象的创建和使用，使得相同的创建过程能够创建不同的产品。

## 缺点
1、产品必须有共同点，范围有限制。  
2、如内部变化复杂，会有很多的建造类，导致系统庞大。

## 应用场景
1、需要生成的对象具有复杂的内部结构。  
2、需要生成的对象内部属性本身相互依赖。

## Java中的使用
JAVA 中的 java.lang.StringBuilder
```java
abstract class AbstractStringBuilder implements Appendable, CharSequence {
    char[] value;
    
    int count;

    public AbstractStringBuilder append(String str) {
        if (str == null)
            return appendNull();
        int len = str.length();
        ensureCapacityInternal(count + len);
        str.getChars(0, len, value, count);
        count += len;
        return this;
    }

    @Override
    public abstract String toString();
}

public final class StringBuilder extends AbstractStringBuilder implements Serializable, CharSequence {
    @Override
    public StringBuilder append(String str) {
        super.append(str);
        return this;
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }
}

public final class StringBuffer extends AbstractStringBuilder implements Serializable, CharSequence {
    @Override
    public synchronized StringBuffer append(String str) {
        toStringCache = null;
        super.append(str);
        return this;
    }

    @Override
    public synchronized String toString() {
        if (toStringCache == null) {
            toStringCache = Arrays.copyOfRange(value, 0, count);
        }
        return new String(toStringCache, true);
    }
}

```