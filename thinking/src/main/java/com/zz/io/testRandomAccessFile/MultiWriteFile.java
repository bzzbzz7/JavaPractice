package com.zz.java.io.testRandomAccessFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class MultiWriteFile {

    static File file = new File("test.txt");

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		if (file.exists()) {
//			file.delete();
//		}
//		new com.zz.io.TestRandomAccessFile.WriteFile(file, 5).start();
//		new com.zz.io.TestRandomAccessFile.WriteFile(file, 3).start();
//		new com.zz.io.TestRandomAccessFile.WriteFile(file, 1).start();
//		new com.zz.io.TestRandomAccessFile.WriteFile(file, 4).start();
//		new com.zz.io.TestRandomAccessFile.WriteFile(file, 2).start();

        try {
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            raf.seek(300);
            byte[] str = new byte[20];
            raf.read(str);
            String in = new String(str);
            System.out.println(in);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
