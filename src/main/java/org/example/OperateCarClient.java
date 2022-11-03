package org.example;

// This component (object) is installed on the Car computer, and it receives
// instructions from a remote server via 5G and some telecommunications software. (notionally)
// This component is installed and runs on the car's computer.
// Its job is to take instructions from the remote server, and then to pass
// those instructions to the concrete class operating this specific car (e.g. BMW).
// Notice that this software is not dependent on the OperateBMW760i class, but is
// instead dependent on the OperateCar interface.
// This means that this client can operate any type of Car.

public class OperateCarClient {

    OperateCar car;

    // Inject a concrete OperateCar object into this object
    // (example of Dependency Injection pattern)
    OperateCarClient(OperateCar car) {
        this.car = car;
    }

    public void testOperateCar(){
        car.signalTurn(Direction.RIGHT,true)    ;
        car.changeLanes(Direction.RIGHT,60.5,70.3);

        // and so on......
        // these commands would be called by software on the client
        // (i.e. in the car computer) that would be created by messages
        // sent from the remote server via 5G to a communications module.

        // this remote controller uses the Interface type (OperateCar) to call methods
        // in the OperateBMW760i class, because that class has implemented the OperateCar
        // interface.

    }

}
