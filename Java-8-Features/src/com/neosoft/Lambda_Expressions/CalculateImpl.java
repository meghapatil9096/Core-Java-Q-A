package com.neosoft.Lambda_Expressions;

public class CalculateImpl implements Calculate{

    @Override
    public int getSum() {
        int sum = 5 + 4;
        return sum;
    }

    public static void main(String[] args) {
        CalculateImpl calculate = new CalculateImpl();
        int b= calculate.getSum();
        System.out.println(b);
    }

}
