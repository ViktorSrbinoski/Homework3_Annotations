import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String c = "";
        while(!c.equals("q")){
            System.out.println("\nPress:\na -> create an airplane\nb -> create a boat\nc -> create a car\nt -> create a truck\nq -> exit");
            Scanner sc = new Scanner(System.in);
            c = sc.nextLine();
            switch(c){
                case "a":
                    Airplane airplane = new Airplane();
                    break;
                case "b":
                    Boat boat = new Boat();
                    break;
                case "c":
                    Car car = new Car();
                    break;
                case "t":
                    Truck truck = new Truck();
                    break;
                case "q":
                    break;
                default:
                    System.out.println("Invalid input");

            }
        }

    }
}
