@VehicleLog(type = "land", name = "truck")
public class Truck extends Vehicle{
    @Override
    public void Go() {
        System.out.println("Driving a truck");
    }

    public Truck(int serialNum, int maxSp) {
        this.serialNumber = serialNum;
        this.maxSpeed = maxSp;
    }

    public Truck() {
    }
}
