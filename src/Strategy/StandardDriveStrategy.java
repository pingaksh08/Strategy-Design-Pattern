package Strategy;

public class StandardDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Standard drive strategy for commercial vehicles.");
    }
}
