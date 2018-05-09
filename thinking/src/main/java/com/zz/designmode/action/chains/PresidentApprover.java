package com.zz.designmode.action.chains;

public class PresidentApprover extends Approver {

    public PresidentApprover(String Name) {
        super(Name + " President");

    }

    @Override
    public void processRequest(PurchaseRequest request) {
        // TODO Auto-generated method stub
        if (50000 <= request.getSum()) {
            System.out.println("**This request " + request.getID()
                    + " will be handled by " + this.Name + " **");
        } else {
            successor.processRequest(request);
        }
    }

}
