package com.zz.designmode.action.chains;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String Name) {
        super(Name + " DepartmentLeader");

    }

    @Override
    public void processRequest(PurchaseRequest request) {
        // TODO Auto-generated method stub

        if ((5000 <= request.getSum()) && (request.getSum() < 10000)) {
            System.out.println("**This request " + request.getID()
                    + " will be handled by " + this.Name + " **");
        } else {
            successor.processRequest(request);
        }

    }

}
