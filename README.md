设计模式演示
=
***设计模式演示。预想学好设计模式，需先了解设计原则，设计七大原则：
开闭原则、依赖倒置原则、单一职责原则、接口隔离原则、迪米特法则、里氏替换原则、合成复用原则。
然而，常用的设计模式包含：工厂模式、单例模式、代理模式、委派模式、策略模式、模板模式、适配器模式***

### 1.工厂模式
#### 1-1.概述
- &ensp; 简单工厂模式（Simple Factory Pattern）是指一个工厂对象决定创建出哪一种产品类的实例。属于创建型模式，但它不属于GOF,23种设计模式。
适用于负责创建的对象较少的场景。
优点：只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关心。
缺点：职责相对过重，新增产品时需要修改工厂类的判断逻辑，违背开闭原则，不易于扩展过于复杂的产品结构。
- &ensp; 工厂方法模式（Factory Method Pattern）是指定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行，属于创建型设计模式。
适用于创建对象需要大量重复代码的场景。
优点：只需关心所需产品对应的工厂，无须关心创建细节；符合开闭原则，提高了系统的可扩展性。
缺点：类的个数容易过多，增加了代码结构的负责度；增加了系统的抽象性和理解难度。
- &ensp; 抽象工厂模式：
### 2.单例模式
#### 2-1.概述

### 3.代理模式
#### 3-1.概述

### 4.委派模式
#### 4-1.概述

### 5.策略模式
#### 5-1.概述

### 6.模板模式
#### 6-1.概述

### 7.适配器模式
#### 7-1.概述
       
