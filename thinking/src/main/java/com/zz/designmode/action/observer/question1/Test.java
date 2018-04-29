package com.zz.designmode.action.observer.question1;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Bee redBee = new Bee("红色蜜蜂");
        Bee yellowBee = new Bee("黄色蜜蜂");
        Bee blackBee = new Bee("黑色蜜蜂");

        Flower flower = new Flower();
        flower.addBee(redBee);
        flower.addBee(yellowBee);
        flower.addBee(blackBee);

        System.out.println("------------早上-------------");
        flower.flowerOpen();
        Thread.sleep(3 * 1000);
        System.out.println("------------晚上-------------");
        flower.flowerClose();
    }
}