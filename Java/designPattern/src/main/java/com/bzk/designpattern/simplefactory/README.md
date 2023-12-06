# 简单（静态）工厂


**简单工厂拥有三个对象：**

①抽象产品类：提供抽象方法供具体产品类实现

②具体产品类：提供具体的产品

③工厂：根据内部逻辑返回相应的产品

PS: **抽象产品类Phone 这里可以是类，也可以是接口或者抽象类，千万不要思维定式。**

## 简单工厂在Java源码中的运用
* java.util.concurrent.Executors类创建不同大小的线程池
* java.util.Calendar类获取不同的时间表实现类对象

```java

Calendar cal = Calendar.getInstance(zone.toTimeZone(), locale);
public static Calendar getInstance(TimeZone zone, Locale aLocale) {
      return createCalendar(zone, aLocale);
  }

  private static Calendar createCalendar(TimeZone zone, Locale aLocale) {
      //部分删减
      Calendar cal = null;

      if (aLocale.hasExtensions()) {
          String caltype = aLocale.getUnicodeLocaleType("ca");
          if (caltype != null) {
              switch (caltype) {
              case "buddhist":
              cal = new BuddhistCalendar(zone, aLocale);
                  break;
              case "japanese":
                  cal = new JapaneseImperialCalendar(zone, aLocale);
                  break;
              case "Gregory":
                  cal = new GregorianCalendar(zone, aLocale);
                  break;
              }
          }
      }
      if (cal == null) {
          if (aLocale.getLanguage() == "th" && aLocale.getCountry() == "TH") {
              cal = new BuddhistCalendar(zone, aLocale);
          } else if (aLocale.getVariant() == "JP" && aLocale.getLanguage() == "ja"
                     && aLocale.getCountry() == "JP") {
              cal = new JapaneseImperialCalendar(zone, aLocale);
          } else {
              cal = new GregorianCalendar(zone, aLocale);
          }
      }
      return cal;
  }
  
```