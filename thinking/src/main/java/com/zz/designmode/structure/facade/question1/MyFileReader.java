package com.zz.designmode.structure.facade.question1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public String read(String fileNameSrc) {
        String line;
        StringBuilder sb = new StringBuilder();

        System.out.println("读取文件，获取明文：");
        try {
            FileReader fr = new FileReader(fileNameSrc);
            BufferedReader br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件不存在！");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件操作错误！");
        }

        return sb.toString();
    }
}