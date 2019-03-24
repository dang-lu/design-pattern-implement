package com.danglu.pattern.singleton.lazy.test;

import com.danglu.pattern.singleton.serialize.SerializableSingleton;

import java.io.*;

/**
 * @ClassName: SerializeSingletonTest
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/24 9:48
 * @Version: v1.0
 **/

public class SerializeSingletonTest {

    public static void main(String[] args) {

        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();

        FileOutputStream fos = null;

        try {

            fos = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();


            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializableSingleton) ois.readObject();
            ois.close();

            System.out.println("s1: " + s1);
            System.out.println("s2: " + s2);
            System.out.println(s1 == s2);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
