package com.danglu.pattern.singleton.lazy.test;

import com.danglu.pattern.singleton.register.EnumSingleton;
import com.danglu.pattern.singleton.serialize.SerializableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @ClassName: EnumSingletonTest
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/24 10:48
 * @Version: v1.0
 **/

public class EnumSingletonTest {

//    public static void main(String[] args) {
//
//        EnumSingleton s1 = null;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//        s2.setData(new Object());
//
//
//        FileOutputStream fos = null;
//
//        try {
//
//            fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s2);
//            oos.flush();
//            oos.close();
//
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            s1 = (EnumSingleton) ois.readObject();
//            ois.close();
//
////            System.out.println("s1: " + s1);
////            System.out.println("s2: " + s2);
////            System.out.println(s1 == s2);
//
//            System.out.println("s1: " + s1.getData());
//            System.out.println("s2: " + s2.getData());
//            System.out.println(s1.getData() == s2.getData());
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }

    public static void main(String[] args) {

        try {

            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton o1 = (EnumSingleton) c.newInstance("Tom", 666);
            System.out.println(o1);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

}
