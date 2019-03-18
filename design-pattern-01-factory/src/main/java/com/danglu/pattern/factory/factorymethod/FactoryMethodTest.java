package com.danglu.pattern.factory.factorymethod;

import com.danglu.pattern.factory.IVehicle;

/**
 * @ClassName: FactoryMethodTest
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/14 11:24
 * @Version: v1.0
 **/

public class FactoryMethodTest {

    public static void main(String[] args) {

        IVehicleFactory factory = new VolkswagenVehicleFactory();
        IVehicle Benz = factory.produce();
        Benz.manufacture();
    }

}
