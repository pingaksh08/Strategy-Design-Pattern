import Strategy.OffRoadDriveStrategy;

public class TataSumo extends Vehicle {
    TataSumo() {
        super(new OffRoadDriveStrategy());
    }
}
