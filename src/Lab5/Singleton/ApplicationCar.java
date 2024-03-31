package Lab5.Singleton;

public class ApplicationCar {
    public static void main(String[] args){
        Car cr = Car.getCar("Diesel");
        System.out.println(cr.getCarCombustibil());
    }
}
