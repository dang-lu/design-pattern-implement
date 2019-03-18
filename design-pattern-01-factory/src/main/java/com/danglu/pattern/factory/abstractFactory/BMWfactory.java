package com.danglu.pattern.factory.abstractFactory;

import com.danglu.pattern.factory.BMW;
import com.danglu.pattern.factory.IVehicle;

/**
 * @ClassName: BMWfactory
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/18 22:07
 * @Version: v1.0
 **/

public class BMWfactory implements IVehicleFactory {

    public IBike produceBike() {

        return new BMWBike();
    }

    public IVehicle produceVehicle() {

        return new BMW();
    }

    public IMotor produceMotro() {

        return new BMWMotor();
    }
}
