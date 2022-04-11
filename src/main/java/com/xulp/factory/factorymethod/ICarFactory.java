package com.xulp.factory.factorymethod;

import com.xulp.factory.bean.ICar;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/2/24 15:15
 * @Description 工厂方法：定义一个产品工厂接口，每个产品工厂都实现这个接口，进行不同实例的创建
 * ICarFactory
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/2/24 15:15 xulp v1.0.0 Created
 */
public interface ICarFactory {
    ICar create();
}
