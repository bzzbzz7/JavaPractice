package com.zz.designmode.create.singleton;

/**
 * Created by zhou.zheng on 2017/6/1.
 * <p>
 * 枚举实现单例
 * <p>
 * 延时加载 ×
 * 线程安全 √
 * 反射攻击 √
 * 反序列化 √
 */

public enum SingletonEnum {
    INSTANCE;

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }

    public String error(){
        return "error" ;
    }
}
