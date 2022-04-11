package com.xulp.factory.factorymethod;

import com.xulp.factory.bean.BenzCar;
import com.xulp.factory.bean.ICar;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/2/24 17:15
 * @Description ---
 * AudiCarFactory
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/2/24 17:15 xulp v1.0.0 Created
 */
public class BenzCarFactory implements ICarFactory{
    @Override
    public ICar create() {
        return new BenzCar();
    }
}
