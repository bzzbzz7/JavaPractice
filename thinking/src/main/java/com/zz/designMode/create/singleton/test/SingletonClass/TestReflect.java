package com.zz.java.thinking.create.singleton.test.SingletonClass;


import com.zz.java.thinking.create.singleton.SingletonClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by zhou.zheng on 2017/6/1.
 */

public class TestReflect {
    /**
     * 测试反射攻击
     */
    public static void testReflect() throws Exception {

        Class<SingletonClass> clazzIn = (Class<SingletonClass>) Class.forName("com.zz.java.thinking.create.singleton.SingletonClass$SingletonFactory");
        Field field = clazzIn.getDeclaredField("INSTANCE");

        //将字段的访问权限设为true：即去除private修饰符的影响
        field.setAccessible(true);

        /*去除final修饰符的影响，将字段设为可修改的*/
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.set(field, field.getModifiers() & ~Modifier.FINAL);

        //设置私有域的值
        field.set("INSTANCE",null);


        //获取单例构造函数
        Class<SingletonClass> clazz = (Class<SingletonClass>) Class.forName("com.zz.java.thinking.create.singleton.SingletonClass");
        Constructor<SingletonClass> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true); // 跳过权限检查，可以使用私有构造器
        SingletonClass singleton1 = c.newInstance();
        SingletonClass singleton3 = c.newInstance();

        if (singleton1 == singleton3) {
            System.out.println("singleton1 singleton3 is the same instance");
        } else {
            System.out.println("singleton1 singleton3 is not the same instance");
        }
    }
}
