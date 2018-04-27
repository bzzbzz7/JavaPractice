package com.zz.java.thinking.create.singleton.test.Singleton;

import com.zz.java.thinking.create.singleton.Singleton;

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
        Singleton singleton1 = Singleton.getInstance();

        FileOutputStream fos = new FileOutputStream("object.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(singleton1);
        oos.close();
        fos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.out"));
        Singleton singleton3 = (Singleton) ois.readObject();
        if (singleton1 == singleton3) {
            System.out.println("singleton1 singleton3 is the same instance");
        } else {
            System.out.println("singleton1 singleton3 is not the same instance");
        }
    }
}
