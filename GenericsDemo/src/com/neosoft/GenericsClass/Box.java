package com.neosoft.GenericsClass;

public class Box<T>
{
    private T value;
//Getter setter method
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {

        Box<Integer> intb1 = new Box<>();
        intb1.setValue(10);
        System.out.println("Integer value : "+intb1.getValue());


        Box<String> strb1 = new Box<>();
        strb1.setValue("Hello");
        System.out.println("String Value : "+strb1.getValue());

    }
}
