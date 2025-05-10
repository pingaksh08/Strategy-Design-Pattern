import Strategy.StandardDriveStrategy;

public class HondaCivic extends Vehicle{

    HondaCivic() {
        super( new StandardDriveStrategy());
    }
}
