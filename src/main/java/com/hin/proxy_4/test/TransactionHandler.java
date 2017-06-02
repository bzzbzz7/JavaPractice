package com.hin.proxy_4.test;

import com.hin.proxy_4.InvocationHandler;

import java.lang.reflect.Method;

/**
 * 事务处理器
 * （在被代理对象方法执行前后加上事务开始和提交）
 *
 * @author Administrator
 */
public class TransactionHandler implements InvocationHandler {

    private Object target;  // 目标对象（被代理对象）

    // 通过构造方法给处理器传入被代理对象
    public TransactionHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public void invoke(Object o, Method m) {
        System.out.println("Transaction begin...");
        try {
            m.invoke(target);  // 调用被代理对象的M方法
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Transaction commit...");
    }

}
