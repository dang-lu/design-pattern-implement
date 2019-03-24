package com.danglu.pattern.singleton.lazy.test;

import com.danglu.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @ClassName: LazyInnerClassSingletonTest
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/24 9:25
 * @Version: v1.0
 **/

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {

        try {

            Class<?> clazz = LazyInnerClassSingleton.class;

            Constructor con = clazz.getDeclaredConstructor(null);

            con.setAccessible(true);

            Object o1 = con.newInstance();
            System.out.println("o1: " + o1);

            Object o2 = LazyInnerClassSingleton.getInstance();
            System.out.println("o2: " + o2);
            System.out.println(o1 == o2);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
