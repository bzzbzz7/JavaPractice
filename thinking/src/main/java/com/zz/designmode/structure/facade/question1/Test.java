package com.zz.designmode.structure.facade.question1;

public class Test {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.FileEncrypt("./thinking/java.txt", "./thinking/java_des.txt");
    }
}
