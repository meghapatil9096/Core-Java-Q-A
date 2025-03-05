package com.neosoft.Multilevel_Inheritances;

public class C extends B{

    void cData()
    {
        System.out.println("C :: Class");
    }

    public static void main(String[] args) {
        C c = new C();
        c.aData();
        c.bData();
        c.cData();
    }
}
