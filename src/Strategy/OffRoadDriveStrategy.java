package Strategy;

public class OffRoadDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Special strategy for traveller vehicles.");
    }
}
