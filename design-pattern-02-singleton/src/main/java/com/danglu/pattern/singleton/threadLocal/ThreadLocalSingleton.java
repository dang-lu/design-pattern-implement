package com.danglu.pattern.singleton.threadLocal;

/**
 * @ClassName: ThreadLocalSingleton
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/26 20:56
 * @Version: v1.0
 **/

public class ThreadLocalSingleton {


    private ThreadLocalSingleton() {};

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {

            return new ThreadLocalSingleton();
        }
    };


    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }

}
