package com.zz.designmode.struct.agent.candymachinermi;

import com.zz.designmode.struct.agent.candymachine.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CandyMachineRemote extends Remote {
    public String getLocation() throws RemoteException;

    public int getCount() throws RemoteException;

    public State getstate() throws RemoteException;
}
