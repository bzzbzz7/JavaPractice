package com.zz.designmode.struct.adapter;


interface DBSocketInterface{
    void powerDB();
}

interface GBSocketInterface{
    void powerGB();
}

class DBSocket implements DBSocketInterface{
    @Override
    public void powerDB() {
        System.out.println("正在使用DBPower...");
    }
}

class GBSocket implements GBSocketInterface{
    @Override
    public void powerGB() {
        System.out.println("正在使用GBPower...");
    }
}

class SocketAdapter implements DBSocketInterface{
    private GBSocketInterface gbSocket;

    public SocketAdapter(GBSocketInterface gbSocket) {
        this.gbSocket = gbSocket;
    }

    @Override
    public void powerDB() {
        gbSocket.powerGB();
    }
}

class GermanyDevice {
    private DBSocketInterface dbSocket;

    public void setSocket(DBSocketInterface socket){
        dbSocket = socket;
    }

    public void charge(){
        dbSocket.powerDB();
    }
}

public class AdapterTest {

    public static void main(String args[]) {
        GBSocketInterface gbSocket = new GBSocket();
        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);

        //适配器充电
        GermanyDevice germanyDevice = new GermanyDevice();
        germanyDevice.setSocket(socketAdapter);
        germanyDevice.charge();

        //原装充电
        DBSocketInterface dbSocket = new DBSocket();
        germanyDevice.setSocket(dbSocket);
        germanyDevice.charge();

    }
}
