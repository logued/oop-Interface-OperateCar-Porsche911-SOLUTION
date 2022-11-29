package org.example;

// This is part of the Porsche 911 SOLUTION.
// This class implements the OperateCar Interface -
// all the methods in the interface must be implemented .
// So. it will be like the Porsche-911 version, but it will have code in 
// each method that would control a Porsche 911.
// (We don't actually implement that code, so we put comments in to that effect)

// This class is an implementation of the OperateClass interface
// for a specific car - a Porsche 911
// It is often called a "Concrete" class for this reason.
//
// The software would be installed in the car's computer, and then
// the remote driving system could make calls to this software
// using the methods defined by the interface.

public class OperatePorsche911 implements IOperateCar,IMonitorCar {

    // the OperateCar method signatures, with implementation --
    // for example:
    public int signalTurn(Direction direction, boolean signalOn) {
        // code to turn Porsche-911's LEFT turn indicator lights on
        // code to turn Porsche-911's LEFT turn indicator lights off
        // code to turn Porsche-911's RIGHT turn indicator lights on
        // code to turn Porsche-911's RIGHT turn indicator lights off
        System.out.println(getClass().getName() + " is signalling to turn RIGHT" );
        return 0;
    }

    @Override
    public int turn(Direction direction, double radius, double startSpeed, double endSpeed) {
        // code to signal the electronics/mechanical devices to make the car tur in the direction specified.
        return 0;
    }

    @Override
    public int changeLanes(Direction direction, double startSpeed, double endSpeed) {
        System.out.println(getClass().getName() + " is changing lanes to " + direction.toString() );
        return 0;
    }

    @Override
    public int getRadarFront(double distanceToCar, double speedOfCar) {
        return 0;
    }

    @Override
    public int getRadarRear(double distanceToCar, double speedOfCar) {
        return 0;
    }

    // other members, as needed -- for example, helper classes not
    // visible to clients of the interface

    //******* implement methods for the IMonitorCar interface ********

    public double engineTemperature() {
        // code to get the temperature from teh control systems
        return 106.50;  // a dummy value
    }
    public double speed() {
        // code to get speed from speed sensors
        return 82.20;
    }
    public boolean isRunning() {
        // code to access on/off sensor
        return true;
    }
}
