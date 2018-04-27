package com.zz.java.thinking.create.singleton;

import java.io.Serializable;

/**
 * Created by zhou.zheng on 2017/6/1.
 * <p>
 * 自定义单例
 * <p>
 * 延时加载 √
 * 线程安全 √
 * 反射攻击 ×
 * 反序列化 √
 */
public class Singleton implements Serializable{
    private volatile static Singleton instance = null;

    private Singleton() {
        if (null != instance) {
            throw new RuntimeException("Reflection Attack");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public Object readResolve() {
        return getInstance();
    }

}