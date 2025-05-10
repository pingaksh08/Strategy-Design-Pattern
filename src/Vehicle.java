import Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    // constructor injection
    Vehicle(DriveStrategy driveStrategyObj) {
        this.driveStrategy = driveStrategyObj;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
