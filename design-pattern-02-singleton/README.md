
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


4. 静态内部类单例模式中**反射**破坏单列的解决方式:

    在外层类的构造方法中添加以下判断：

    ```java
    
    if (LazyHolder.lazyInnerClassSingleton != null) {
                System.out.println("LazyHolder has been initialized!");
                throw new RuntimeException("不允许构建多个实例！");
            }
    
    ```
    
5. 静态内部类单例模式中**序列化**破坏单列的解决方式:

    重写readResolve方法，覆盖反序列化出来的对象。但实际上还是创建了两次对象，只不过发生在JDK层面，相对来说比较安全。
    之前反序列化出来的对象会被GC回收。
    
    ```java
       
    private Object readResolve() { 
            
            return INSTANCE;
        }

    ```

6. 枚举式单例模式，属于注册式单列模式

    从JDK层面保证枚举不被反序列化和反射破坏；
    
    ```java
       
       // 反射获取构造器，然后实例化
       EnumSingleton o1 = (EnumSingleton) c.newInstance("Tom", 666);
       
       // 进入到.newInstance方法
       if ((clazz.getModifiers() & Modifier.ENUM) != 0)
                   throw new IllegalArgumentException("Cannot reflectively create enum objects");
       
 
    ```
    
7. 容器时单例模式，属于注册式单列模式
    存在线程安全问题，方便对象的管理。
    
    ```java
    
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();
    
        public static Object getBean(String className) {
            synchronized (ioc) {
                if (!ioc.containsKey(className)){
                    Object obj = null;
                    try {
                        obj = Class.forName(className).newInstance();
                        ioc.put(className, obj);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    return obj;
                }
                return ioc.get(className);
            }
        }
    
    ```


8. ThreadLocal 单例模式

   保证线程内部的全局唯一，且天生线程安全

//伪线程安全，在同一个线程内部能保证线程安全
// 应用场景： 可以用其实现数据源动态切换，即数据源路由

```java

private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {

            return new ThreadLocalSingleton();
        }
    };


    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }

```

9. 单例模式的优点：

    
 **优点**
  * 在内存中只有一个实例，减少内存开销
  * 可以避免对资源的多重占用
  * 设置全局访问点，严格控制访问

  **缺点**
  * 没有接口，扩展困难
  * 如果要扩展单例对象，只有修改代码，没有其他方法，违反**开闭原则**
  

10. 单例模式重点总结：

   * 私有化构造器
   * 保证线程安全
   * 延迟加载
   * 防止序列化和反序列化破坏单利
   * 防御反射攻击单利