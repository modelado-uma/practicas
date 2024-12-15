package ejercicio3;

public class Car {
    private String licensePlate;
    private Model model;

    public Car(String licensePlate, Model model){
        this.licensePlate = licensePlate;
        this.model = model;
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }

    public Model getModel(){
        return this.model;
    }
}