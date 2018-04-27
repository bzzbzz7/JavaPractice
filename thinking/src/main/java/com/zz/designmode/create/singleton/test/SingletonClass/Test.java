package com.zz.designmode.create.singleton.test.SingletonClass;

import com.zz.designmode.create.singleton.SingletonClass;

public class Test {

    public static void main(String[] args) {
//        try {
//            TestDeserialize.testDeserialize();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        SingletonClass.hello();
        try {
            TestReflect.testReflect();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
