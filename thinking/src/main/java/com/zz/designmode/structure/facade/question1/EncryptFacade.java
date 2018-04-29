package com.zz.designmode.structure.facade.question1;

public class EncryptFacade {
    //维持对其他对象的引用  
    private MyFileReader reader;
    private CipherMachine cipher;
    private MyFileWriter writer;

    public EncryptFacade() {
        reader = new MyFileReader();
        cipher = new CipherMachine();
        writer = new MyFileWriter();
    }

    //调用其他对象的业务方法  
    public void FileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}  