@VehicleLog(type = "water", name = "boat")
public class Boat extends Vehicle {
    @Override
    public void Go() {
        System.out.println("Sailing a boat");
    }

    public Boat(int serialNum, int maxSp) {
        this.serialNumber = serialNum;
        this.maxSpeed = maxSp;
    }

    public Boat() {
    }
}
