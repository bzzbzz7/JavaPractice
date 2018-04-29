package com.zz.designmode.structure.facade.question1;

public class CipherMachine {
    public String encrypt(String plainText) {
        System.out.println("数据加密，将明文转换为密文：");
        String es = "";
        char[] chars = plainText.toCharArray();
        for (char ch : chars) {
            String c = String.valueOf(ch % 7);
            es += c;
        }
        System.out.println(es);
        return es;
    }
}