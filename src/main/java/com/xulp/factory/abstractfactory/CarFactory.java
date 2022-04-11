package com.xulp.factory.abstractfactory;

import com.xulp.factory.bean.ICar;
import com.xulp.factory.bean.ICarLogo;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/2/24 17:22
 * @Description 抽象工厂：一个产品存在多个属性，可以创建多个产品，这个产品不同的属性都各自有不同的实例化
 * CarFactory
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/2/24 17:22 xulp v1.0.0 Created
 */
public interface CarFactory {

   ICar createCar();

   ICarLogo createCarLogo();
}
