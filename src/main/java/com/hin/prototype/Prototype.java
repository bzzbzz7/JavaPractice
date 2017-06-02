package com.hin.prototype;

/**
 * 克隆自身的类
 *
 * @author Administrator
 */
public class Prototype implements Cloneable {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
