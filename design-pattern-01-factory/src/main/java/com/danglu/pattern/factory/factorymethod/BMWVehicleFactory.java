package com.danglu.pattern.factory.factorymethod;

import com.danglu.pattern.factory.BMW;
import com.danglu.pattern.factory.IVehicle;

/**
 * @ClassName: BMWVehicleFactory
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/14 11:43
 * @Version: v1.0
 **/

public class BMWVehicleFactory implements IVehicleFactory {

    public IVehicle produce() {

        return new BMW();
    }
}
