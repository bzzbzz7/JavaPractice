package com.zz.designmode.struct.facade.question1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public void write(String encryptStr, String fileNameDes) {
        System.out.println("保存密文，写入文件。");
        try {
            FileWriter fw = new FileWriter(fileNameDes);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(encryptStr);
            bw.flush();

            bw.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件不存在！");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件操作错误！");
        }
    }
}  