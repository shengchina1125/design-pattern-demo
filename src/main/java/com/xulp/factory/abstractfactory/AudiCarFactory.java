package com.xulp.factory.abstractfactory;

import com.xulp.factory.bean.AudiCar;
import com.xulp.factory.bean.AudiCarLogo;
import com.xulp.factory.bean.ICar;
import com.xulp.factory.bean.ICarLogo;

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
public class AudiCarFactory implements CarFactory{

    @Override
    public ICar createCar() {
        return new AudiCar();
    }

    @Override
    public ICarLogo createCarLogo() {
        return new AudiCarLogo();
    }
}
