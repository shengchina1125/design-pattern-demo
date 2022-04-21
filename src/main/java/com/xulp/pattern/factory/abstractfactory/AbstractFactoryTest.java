package com.xulp.pattern.factory.abstractfactory;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/2/24 17:33
 * @Description 抽象工厂：不符合开闭原则，产品新增一个属性，就要添加一个方法
 * AbstractFactoryTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/2/24 17:33 xulp v1.0.0 Created
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        CarFactory audiFactory = new AudiCarFactory();
        audiFactory.createCar().brand();
        audiFactory.createCarLogo().recode();
        CarFactory benzFactory = new BenzCarFactory();
        benzFactory.createCar().brand();
        benzFactory.createCarLogo().recode();
    }
}
