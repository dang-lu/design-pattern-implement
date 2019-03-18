package com.danglu.pattern.factory.factorymethod;

import com.danglu.pattern.factory.IVehicle;

/**
 * @ClassName: IVehicleFactory
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/14 11:18
 * @Version: v1.0
 **/

public interface IVehicleFactory {

    IVehicle produce();

}
