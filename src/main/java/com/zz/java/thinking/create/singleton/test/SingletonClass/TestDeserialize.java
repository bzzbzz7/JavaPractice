package com.zz.java.thinking.create.singleton.test.SingletonClassClass;

import com.zz.java.thinking.create.singleton.SingletonClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by zhou.zheng on 2017/6/1.
 */

public class TestDeserialize {
    /**
     * 测试反序列化
     */
    public static void testDeserialize() throws IOException, ClassNotFoundException {
        SingletonClass singleton1 = SingletonClass.getInstance();

        FileOutputStream fos = new FileOutputStream("object.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(singleton1);
        oos.close();
        fos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.out"));
        SingletonClass singleton3 = (SingletonClass) ois.readObject();
        if (singleton1 == singleton3) {
            System.out.println("singleton1 singleton3 is the same instance");
        } else {
            System.out.println("singleton1 singleton3 is not the same instance");
        }
    }
}
