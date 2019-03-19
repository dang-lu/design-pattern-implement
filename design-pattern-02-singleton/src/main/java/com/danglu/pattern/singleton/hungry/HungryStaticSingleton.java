package com.danglu.pattern.singleton.hungry;

/**
 * @ClassName: HungryStaticSingleton
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/19 21:15
 * @Version: v1.0
 **/

public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private  HungryStaticSingleton () {}

    public static HungryStaticSingleton getInstance() {

        return null;

    }

}
