package com.neosoft.Hierarchical_Inheritances;

public class Test {

    public static void main(String[] args) {

        CurrentAccount c = new CurrentAccount();
        c.currentData();
        c.accountData();

        System.out.println();

        SavingAccount s = new SavingAccount();
        s.savingData();
        s.accountData();
    }

}
