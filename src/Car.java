@VehicleLog(type = "land", name = "car")
public class Car extends Vehicle {
    @Override
    public void Go() {
        System.out.println("Driving a car");
    }

    public Car(int serialNum, int maxSp) {
        this.serialNumber = serialNum;
        this.maxSpeed = maxSp;
    }

    public Car() {
    }
}
