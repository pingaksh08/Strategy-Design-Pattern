package Strategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Special drive strategy for sport vehicles.");
    }
}
