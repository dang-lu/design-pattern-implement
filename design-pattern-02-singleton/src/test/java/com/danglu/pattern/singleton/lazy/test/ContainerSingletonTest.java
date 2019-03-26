package com.danglu.pattern.singleton.lazy.test;

import com.danglu.pattern.singleton.register.ContainerSingleton;

/**
 * @ClassName: ContainerSingletonTest
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/26 20:44
 * @Version: v1.0
 **/

public class ContainerSingletonTest {

    public static void main(String[] args) {

        ContainerSingleton.getBean("com.danglu.pattern.singleton.lazy.test.EnumSingletonTest.class")

    }

}
