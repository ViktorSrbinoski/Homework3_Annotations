@VehicleLog
public abstract class Vehicle {
    protected int serialNumber;
    protected int maxSpeed;

    public abstract void Go();

    public Vehicle(){
        VehicleLog log = this.getClass().getAnnotation(VehicleLog.class);
        if(log == null){
            System.out.println("Annotation is missing");
        }
        else{
            System.out.printf("A vehicle of type: %s, with name: %s was created\n", log.type(), log.name());
        }
    }
}
