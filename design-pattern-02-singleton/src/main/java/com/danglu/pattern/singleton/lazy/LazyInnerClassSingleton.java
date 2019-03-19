package com.danglu.pattern.singleton.lazy;

/**
 * @ClassName: LazyInnerClassSingleton
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/19 22:51
 * @Version: v1.0
 **/

public class LazyInnerClassSingleton {


    private LazyInnerClassSingleton () {}


    public static LazyInnerClassSingleton getInstance() {
        return LazyHolder.lazyInnerClassSingleton;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();
    }

}
