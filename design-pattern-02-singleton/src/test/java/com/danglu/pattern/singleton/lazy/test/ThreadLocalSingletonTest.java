package com.danglu.pattern.singleton.lazy.test;

import com.danglu.pattern.singleton.threadLocal.ThreadLocalSingleton;

/**
 * @ClassName: ThreadLocalSingletonTest
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/26 21:01
 * @Version: v1.0
 **/


//伪线程安全，在同一个线程内部能保证线程安全
// 应用场景： 可以用其实现数据源动态切换，即数据源路由
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
        System.out.println("END!!!");

    }

}
