package com.xulp.pattern.factory.abstractfactory;

import com.xulp.pattern.factory.bean.BenzCar;
import com.xulp.pattern.factory.bean.BenzCarLogo;
import com.xulp.pattern.factory.bean.ICar;
import com.xulp.pattern.factory.bean.ICarLogo;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/2/24 17:28
 * @Description ---
 * AudiCarFactory
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/2/24 17:28 xulp v1.0.0 Created
 */
public class BenzCarFactory implements CarFactory {

    @Override
    public ICar createCar() {
        return new BenzCar();
    }

    @Override
    public ICarLogo createCarLogo() {
        return new BenzCarLogo();
    }
}
