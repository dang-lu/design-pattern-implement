
###    Class Diagram of Simple Factory Design Pattern

* #### Simple Factory Pattern:

![](https://github.com/dang-lu/design-pattern-implement/blob/master/static/images/factory/simple-factory-pattern.PNG)


* #### Factory Method Pattern:

![](https://github.com/dang-lu/design-pattern-implement/blob/master/static/images/factory/factory-method-pattern.PNG)

* #### Abstract Factory Pattern:

![](https://github.com/dang-lu/design-pattern-implement/blob/master/static/images/factory/abstract-factory-pattern.PNG)


### 工程模式总结

* 简单工厂模式：
    创建型模式，不属于GOF的23种设计模式；
    
 优点：只需传入工厂类的参数就可以，不需要关心创建对象的逻辑

 缺点：
    a). 工厂类职责过重，新增产品时需要修改原有的判断逻辑；
    b). 违反开闭原则；
    c). 不易于扩展过于复杂的产品结构
    
    
    
 Java中的使用案例： Calendar类 createCalendar方法
                   LoggerFactory类 getLogger方法
                   
                   
                 
* 工厂方法模式：

    