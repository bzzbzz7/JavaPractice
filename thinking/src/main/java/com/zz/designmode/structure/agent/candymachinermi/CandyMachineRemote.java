package com.zz.designmode.structure.agent.candymachinermi;

import com.zz.designmode.structure.agent.candymachine.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CandyMachineRemote extends Remote {
    public String getLocation() throws RemoteException;

    public int getCount() throws RemoteException;

    public State getstate() throws RemoteException;
}
