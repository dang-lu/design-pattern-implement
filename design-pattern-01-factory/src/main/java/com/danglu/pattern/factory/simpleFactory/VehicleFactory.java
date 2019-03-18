package com.danglu.pattern.factory.simpleFactory;


import com.danglu.pattern.factory.IVehicle;

/**
 * @ClassName: VehicleFactory
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/14 10:27
 * @Version: v1.0
 **/

public class VehicleFactory {

//    public IVehicle create (String name) {
//        if ("Volkswagen".equals(name)){
//            return new Volkswagen();
//        }else {
//            return null;
//        }
//    }

//    public IVehicle create (String className) {
//
//        try{
//            if (!(null == className || "".equals(className))){
//                return (IVehicle) Class.forName(className).newInstance();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        return null;
//    }


    public IVehicle create (Class clazz) {

        try {

            if (null != clazz) {
                return (IVehicle) clazz.newInstance();
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

        return  null;
    }
}
