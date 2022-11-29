package org.example;

// Defines an Interface that declares signatures for a number of methods
// but does not implement code for any of the methods.

public interface IOperateCar {

    // constant declarations, if any

    // method signatures,  all methods are public in an interface

    int turn(Direction direction,       // An enum with values RIGHT, LEFT
             double radius,
             double startSpeed,
             double endSpeed);

    int changeLanes(Direction direction,
                    double startSpeed,
                    double endSpeed);

    int signalTurn(Direction direction,
                   boolean signalOn);

    int getRadarFront(double distanceToCar,
                      double speedOfCar);

    int getRadarRear(double distanceToCar,
                     double speedOfCar);

    // other methods as required.....
}