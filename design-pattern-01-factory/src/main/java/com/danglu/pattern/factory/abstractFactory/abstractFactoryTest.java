package com.danglu.pattern.factory.abstractFactory;

/**
 * @ClassName: abstractFactoryTest
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/18 22:10
 * @Version: v1.0
 **/

public class abstractFactoryTest {

    public static void main(String[] args) {

        IVehicleFactory factory = new BMWfactory();
        factory.produceBike();
        factory.produceMotro();
        factory.produceVehicle().manufacture();
    }

}
