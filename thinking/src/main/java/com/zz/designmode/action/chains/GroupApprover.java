package com.zz.designmode.action.chains;

public class GroupApprover extends Approver {

    public GroupApprover(String Name) {
        super(Name + " GroupLeader");
        // TODO Auto-generated constructor stub

    }

    @Override
    public void processRequest(PurchaseRequest request) {
        // TODO Auto-generated method stub

        if (request.getSum() < 5000) {
            System.out.println("**This request " + request.getID()
                    + " will be handled by "
                    + this.Name + " **");
        } else {
            successor.processRequest(request);
        }
    }

}
