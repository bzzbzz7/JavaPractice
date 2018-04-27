package com.zz.designmode.create.singleton;

import java.io.Serializable;

/**
 * Created by zhou.zheng on 2017/5/31.
 * <p>
 * 静态内部类单例
 * <p>
 * 延时加载 √
 * 线程安全 √
 * 反射攻击 ×
 * 反序列化 √
 */
public class SingletonClass implements Serializable{

    private SingletonClass() {
        if (null != SingletonFactory.INSTANCE){
            throw new RuntimeException("Reflection Attack");
        }
    }

    private static class SingletonFactory {
        private static final SingletonClass INSTANCE = new SingletonClass();
    }

    public static SingletonClass getInstance() {
        return SingletonFactory.INSTANCE;
    }

    public Object readResolve() {
        return getInstance();
    }

    public static void hello(){
        System.out.println("hello");
    }
}  