package com.zz.java.thinking.create.singleton;

import java.io.Serializable;

/**
 * Created by zhou.zheng on 2017/6/1.
 * <p>
 * 静态加载单例,
 * <p>
 * 延时加载 ×
 * 线程安全 √
 * 反射攻击 ×
 * 反序列化 √
 */

public class SingletonStaticLoad implements Serializable{
    private static final SingletonStaticLoad INSTANCE = new SingletonStaticLoad();

    private SingletonStaticLoad() {
        if (null != INSTANCE){
            throw new RuntimeException("Reflection Attack");
        }
    }

    public static SingletonStaticLoad getInstance() {
        return INSTANCE;
    }

    public Object readResolve() {
        return getInstance();
    }
}  
