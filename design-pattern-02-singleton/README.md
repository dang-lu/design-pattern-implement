
### Singleton Pattern

1. 饿汉式单例模式：
    无论是否需要都会初始化，浪费资源



2. 懒汉式单例模式
    synchronized 直接写在方法上仍存在一定性能问题

    关于JVM指令重排序问题：
      过程：
    ​    1.	分配内存给这个对象
    ​    2.	初始化对象
    ​    3.	将初始化的对象和内存地址建立关联、赋值
    ​    4.	用户初次访问
    
      解决方案：
    ​    使用 volatile 关键字, sample code as below:
    ```java
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
    ```

3. 静态内部类懒汉式单例模式
    a). 全程未用到synchronized，性能较高
    b). 内部类需要等到外部类调用时才执行
    c). 巧妙地运用了内部类的特性，JVM底层的执行逻辑，完美地避免了线程安全问题