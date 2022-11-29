package org.example;

public class MonitorCarClient {

    IMonitorCar carMonitor;

    // Inject a concrete OperateCar object into this object
    // (example of Dependency Injection pattern)
    MonitorCarClient(IMonitorCar carMonitor) {
        this.carMonitor = carMonitor;
    }

    public void testOperateCar() {

        double temperature = carMonitor.engineTemperature();
        System.out.println("MonitorCarClient : temperature of car is " + temperature);

        double speed = carMonitor.speed();

        boolean engineIsOn = carMonitor.isRunning();

        // values could be sent back via 5G to the
        // remote monitoring server.

    }
}