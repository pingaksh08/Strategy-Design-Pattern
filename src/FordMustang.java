import Strategy.SportsDriveStrategy;

public class FordMustang extends Vehicle{

    FordMustang () {
        super(new SportsDriveStrategy());
    }
}
