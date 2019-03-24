package com.danglu.pattern.singleton.serialize;

import java.io.Serializable;

/**
 * @ClassName: SerializeSigleton
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/24 9:52
 * @Version: v1.0
 **/

public class SerializableSingleton implements Serializable {

    public static final SerializableSingleton INSTANCE = new SerializableSingleton();

//    private SerializableSingleton() {}

    public static SerializableSingleton getInstance() { return INSTANCE; }

    private Object readResolve() {

        return INSTANCE;
    }
}
