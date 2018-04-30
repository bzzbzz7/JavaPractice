package com.zz.designmode.action.state.question1.oldmode;

public class MainTest {
    public static void main(String[] args) {
        CandyMachine mCandyMachine = new CandyMachine(1);
        mCandyMachine.printstate();

        mCandyMachine.insertCoin();
        mCandyMachine.printstate();

        mCandyMachine.turnCrank();
        mCandyMachine.printstate();

        mCandyMachine.insertCoin();
        mCandyMachine.printstate();

        mCandyMachine.turnCrank();

        mCandyMachine.printstate();
    }
}
