package com.xulp.pattern.factory.simplefactory;

import com.xulp.pattern.factory.bean.AudiCar;
import com.xulp.pattern.factory.bean.BenzCar;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/2/19 16:08
 * @Description ---
 * CarSimpleFactory
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/2/19 16:08 xulp v1.0.0 Created
 */
public class CarSimpleFactoryTest {

    public static void main(String[] args) {
        CarSimpleFactory factory = new CarSimpleFactory();
        AudiCar audiCar = (AudiCar) factory.create("com.xulp.factory.bean.AudiCar");
        BenzCar benzCar = (BenzCar) factory.create(BenzCar.class);
        audiCar.brand();
        benzCar.brand();

    }
}
