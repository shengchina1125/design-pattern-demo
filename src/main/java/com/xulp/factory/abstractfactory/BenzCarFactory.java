package com.xulp.factory.abstractfactory;

import com.xulp.factory.bean.*;

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
