package com.zz.designmode.create.singleton.test.Singleton;


import com.zz.designmode.create.singleton.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by zhou.zheng on 2017/6/1.
 */

public class TestReflect {
    /**
     * 测试反射攻击
     */
    public static void testReflect() throws Exception {
        Class<Singleton> clazz = (Class<Singleton>) Class.forName("com.zz.java.designMode.create.singleton.Singleton");
        Constructor<Singleton> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true); // 跳过权限检查，可以使用私有构造器
        Singleton singleton1 = c.newInstance();

        Field field = clazz.getDeclaredField("instance");
        field.setAccessible(true);
        //设置私有域的值
        field.set("instance",null);

        Singleton singleton3 = c.newInstance();

        if (singleton1 == singleton3) {
            System.out.println("singleton1 singleton3 is the same instance");
        } else {
            System.out.println("singleton1 singleton3 is not the same instance");
        }
    }
}
