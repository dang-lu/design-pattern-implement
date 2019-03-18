package com.danglu.pattern.factory.factorymethod;

import com.danglu.pattern.factory.Benz;
import com.danglu.pattern.factory.IVehicle;

/**
 * @ClassName: BenzVehicleFactory
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/14 11:24
 * @Version: v1.0
 **/

public class BenzVehicleFactory implements IVehicleFactory {

    public IVehicle produce() {

        return new Benz();
    }
}
