package Lab5.Singleton;

public class Car {
    private static Car car;
    private String combustibil;
    private Car(String fuel){this.combustibil = fuel;}
    public static Car getCar(String combustibil){
        if(car==null) car = new Car(combustibil);
        return car;
    }

    public String getCarCombustibil() {
        return combustibil;
    }
}
