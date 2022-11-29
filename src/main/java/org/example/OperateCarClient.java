package org.example;

// This component (object) is installed on the Car computer, and it receives
// instructions from a remote server via 5G and some telecommunications software. (notionally)
//
// Its job is to take instructions from the remote server, and then to pass
// those instructions to the concrete class operating this specific car (e.g. BMW).
//
// Notice that this component is not dependent on the OperateBMW760i
// or Porsche911 class, but is
// instead dependent on the OperateCar interface.
// A Reference to the particular car operator component (e.g. BMW) is
// passed into this class via its constructor.  This is called Dependency Injection.
// This means that this client can operate any type of Car, it just needs to be
// initialized with a specific OperateCar controller
// (that is injected into the operator).
//
// This component is not dependent on any particular implementation of a car operator
// so, it can be installed on all cars that use the remote control system.

public class OperateCarClient {

    // This is a client of the OperateBMW760i (or Porsche911 ) object in this case because
    // in our example the BMW is passed into the constructor.
    // But note that it depends only on objects that implement the IOperateCar interface,
    // and thus can be generally used.
    // It uses the services (methods) of the class passed in.
    // It calls only methods that are listed in the IOperateCar interface.

    IOperateCar carOperator;

    // Inject a concrete OperateCar object into this object
    // (example of Dependency Injection pattern)
    OperateCarClient(IOperateCar carOperator) {
        this.carOperator = carOperator;
    }

    public void testOperateCar(){

        carOperator.signalTurn(Direction.RIGHT,true);
        carOperator.changeLanes(Direction.RIGHT,60.5,70.3);

        // and so on......
        // these commands would be called by software on the client
        // (i.e. in the car computer) that would be created by messages
        // sent from the remote server via 5G to a communications module.

        // this remote controller uses the Interface type (OperateCar) to call methods
        // in the OperateBMW760i class, because that class has implemented the OperateCar
        // interface.
    }
}
