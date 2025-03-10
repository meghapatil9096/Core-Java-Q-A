package com.neosoft.Functinal_InterfaceDemo;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

//        Consumer to print message
//        Consumer take T type and return Nothing
        Consumer<String> printMsg = msg-> System.out.println("Message : "+msg);
        printMsg.accept("Hello From Consumer !");
    }
}
