package com.danglu.pattern.singleton.lazy;

/**
 * @ClassName: LazySimpleSingleton
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/19 21:26
 * @Version: v1.0
 **/

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton () {}


    public synchronized static final LazySimpleSingleton getInstance() {

        if (lazySimpleSingleton == null) {

            lazySimpleSingleton = new LazySimpleSingleton();
        }

        return lazySimpleSingleton;
    }

}
