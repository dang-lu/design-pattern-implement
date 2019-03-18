package com.danglu.pattern.factory.simpleFactory;

import com.danglu.pattern.factory.Benz;
import com.danglu.pattern.factory.IVehicle;

import java.util.Calendar;

/**
 * @ClassName: VehicleFactoryTest
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/14 10:31
 * @Version: v1.0
 **/

public class VehicleFactoryTest {

    public static void main(String[] args) {

//        VehicleFactory factory = new VehicleFactory();
//        IVehicle vehicle = factory.create("Volkswagen");
//        vehicle.manufacture();


//        VehicleFactory factory = new VehicleFactory();
//        IVehicle vehicle = factory.create("com.danglu.pattern.factory.Volkswagen");
//        vehicle.manufacture();


        VehicleFactory factory = new VehicleFactory();
        IVehicle vehicle = factory.create(Benz.class);
        vehicle.manufacture();


        //简单工厂模式实际案例
        Calendar.getInstance();
//        LoggerFactory.getLogger();
    }

}
