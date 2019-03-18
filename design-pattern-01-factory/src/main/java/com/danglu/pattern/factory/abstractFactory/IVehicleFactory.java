package com.danglu.pattern.factory.abstractFactory;

import com.danglu.pattern.factory.IVehicle;

/**
 * @ClassName: IVehicle
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/18 21:56
 * @Version: v1.0
 **/

public interface IVehicleFactory {

    IBike produceBike();

    IVehicle produceVehicle();

    IMotor produceMotro();

}
