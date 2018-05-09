package com.zz.designmode.action.chains;

public abstract class Approver {
    Approver successor;
    String Name;

    public Approver(String Name) {
        this.Name = Name;
    }

    public abstract void processRequest(PurchaseRequest request);

    public void setSuccessor(Approver successor) {
        // TODO Auto-generated method stub
        this.successor = successor;
    }
}
