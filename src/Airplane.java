@VehicleLog(type = "air", name = "airplane")
public class Airplane extends Vehicle {
    @Override
    public void Go() {
        System.out.println("Flying a plane");
    }

    public Airplane(int serialNum, int maxSp) {
        this.serialNumber = serialNum;
        this.maxSpeed = maxSp;
    }

    public Airplane() {
    }
}
