package com.danglu.pattern.singleton.hungry;

/**
 * @ClassName: HungrySingleton
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/19 21:09
 * @Version: v1.0
 **/

public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton () {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
