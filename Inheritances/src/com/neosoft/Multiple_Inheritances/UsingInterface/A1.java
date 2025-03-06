package com.neosoft.Multiple_Inheritances.UsingInterface;

interface One
{
    void printData();
}
interface Two
{
    void printFor();
}
interface Three extends One, Two
{
    void printData();
}

public class A1 implements Three {

    @Override
    public void printData() {
        System.out.println("Print Data");
    }

    @Override
    public void printFor() {
        System.out.println("Print For");
    }
}
