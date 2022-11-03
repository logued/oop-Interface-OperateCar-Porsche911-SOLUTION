package org.example;
//
// The Java Tutorials
// Taken from the Interfaces section.
// https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html


public class Main {
    public static void main(String[] args) {
        System.out.println("OperateCar Interface!");

        OperateCarClient operateCarClient1 = new OperateCarClient(new OperateBMW760i());
        operateCarClient1.testOperateCar();

        //TODO
        // See Exercise Sheet based on OperateCar


    }
}