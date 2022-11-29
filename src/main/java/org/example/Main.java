package org.example;
//
// The Java Tutorials
// Taken from the Interfaces section.
// https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html

public class Main {
    public static void main(String[] args) {
        System.out.println("OperateCar Interface!");

        // We use Dependency
        OperateCarClient operateCarClient1 = new OperateCarClient(new OperateBMW760i());
        operateCarClient1.testOperateCar();


        // Dependency Injection is used above to inject the specific OperateCarXXXX object
        // into the client.  The client will accept any object that implements the OperateCar interface
        // as it calls only methods defined in that interface. It also uses a reference of type OperateCar
        // to refer to the object passed in.

        //TODO
        // See Exercise Sheet based on OperateCar

        OperatePorsche911 porsche911 = new OperatePorsche911();
        OperateCarClient operateCarClient2 = new OperateCarClient(porsche911);
        operateCarClient2.testOperateCar();

        MonitorCarClient monitorCarClient = new MonitorCarClient(porsche911);
        monitorCarClient.testOperateCar();
    }
}