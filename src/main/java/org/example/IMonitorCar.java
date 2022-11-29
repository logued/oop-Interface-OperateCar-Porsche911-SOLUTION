package org.example;

public interface IMonitorCar {
    double engineTemperature();
    double speed();
    boolean isRunning();
}
// If Porsche want their Porsch911 software to provide monitoring
// information to a monitoring client, then they must code the
// Porsche911 so that it implements the IMonitorCar interface.
// This is done in the OperatePorsche911 class.