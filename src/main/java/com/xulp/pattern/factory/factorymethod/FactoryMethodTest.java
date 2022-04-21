package com.xulp.pattern.factory.factorymethod;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/2/24 17:16
 * @Description 工厂方法测试类
 * FactoryMethodTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/2/24 17:16 xulp v1.0.0 Created
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICarFactory audiFactory = new AudiCarFactory();
        audiFactory.create().brand();
        ICarFactory benzFactory = new BenzCarFactory();
        benzFactory.create().brand();
    }
}
