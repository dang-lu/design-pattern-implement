package com.danglu.pattern.singleton.lazy;

/**
 * @ClassName: LazyDoubleCheckSingleton
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/19 22:24
 * @Version: v1.0
 **/

public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton () {}

    public static LazyDoubleCheckSingleton getInstance() {

        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }

        return lazyDoubleCheckSingleton;

    }

}
