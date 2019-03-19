package com.danglu.pattern.singleton.lazy.test;

import com.danglu.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.danglu.pattern.singleton.lazy.LazyInnerClassSingleton;
import com.danglu.pattern.singleton.lazy.LazySimpleSingleton;

/**
 * @ClassName: ExecutorThread
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2019/3/19 21:43
 * @Version: v1.0
 **/

public class ExecutorThread implements Runnable {

    public void run() {

//        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + ": " + lazySimpleSingleton);

//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        System.out LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();

        LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + lazyInnerClassSingleton);

    }
}
