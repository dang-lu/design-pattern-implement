package com.danglu.pattern.singleton.lazy.test;

/**
 * @ClassName: LazySimpleSingletonTest
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/19 21:41
 * @Version: v1.0
 **/

public class LazySimpleSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Executor End!!!");

    }

}
