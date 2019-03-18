package com.danglu.pattern.factory.factorymethod;

import com.danglu.pattern.factory.Volkswagen;
import com.danglu.pattern.factory.IVehicle;

/**
 * @ClassName: VolkswagenVehicleFactory
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/14 11:21
 * @Version: v1.0
 **/

public class VolkswagenVehicleFactory implements IVehicleFactory {


    public IVehicle produce() {

        return new Volkswagen();
    }
}
