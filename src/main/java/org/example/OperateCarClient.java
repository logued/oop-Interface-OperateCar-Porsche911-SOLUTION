package org.example;

public class RemoteCarController {

    OperateCar remoteCar;

    RemoteCarController(OperateCar car) {
        this.remoteCar = car;
    }

    public void startControllingRemoteCar(){
        remoteCar.signalTurn(Direction.RIGHT,true);
        remoteCar.changeLanes(Direction.RIGHT,60.5,70.3);

        // and so on......
        // these commands would be issued by a person or AI controlling the car remotely


        // this remote controller uses the Interface type (OperateCar) to call methods
        // in the OperateBMW760i class, because that class has implemented the OperateCar
        // interface.

    }

}
