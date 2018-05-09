package com.zz.designmode.action.chains;


public class MainTest {

    public static void main(String[] args) {

        Client mClient = new Client();
        Approver groupLeader = new GroupApprover("Tom");
        Approver departmentLeader = new DepartmentApprover("Jerry");
        Approver vicePresident = new VicePresidentApprover("Kate");
        Approver president = new PresidentApprover("Bush");

        groupLeader.setSuccessor(vicePresident);
        departmentLeader.setSuccessor(president);
        vicePresident.setSuccessor(departmentLeader);
        president.setSuccessor(groupLeader);

        vicePresident.processRequest(mClient.sendRequst(1, 100, 40));
        vicePresident.processRequest(mClient.sendRequst(2, 200, 40));
        vicePresident.processRequest(mClient.sendRequst(3, 300, 40));
        vicePresident.processRequest(mClient.sendRequst(4, 400, 140));

    }


}
