package ejercicio2;

import java.util.Date;
import java.util.List;

public class Car {
    private String licensePlate;
    private Model model;
    private String assignedOffice;
    private CarState state;
    private Car substitute;
    private Date outOfServiceUntil;

    public Car(String licensePlate, Model model, String assignedOffice) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.assignedOffice = assignedOffice;
        this.state = new InService(); // Estado inicial
    }

    // Operaciones principales
    public void takeOutOfService(Date backToServiceDate, List<Car> cars) {
        state.takeOutOfService(this, backToServiceDate, cars);
    }

    public void putInService() {
        state.putInService(this);
    }

    // Getters y setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public Model getModel() {
        return model;
    }

    public String getAssignedOffice() {
        return assignedOffice;
    }

    public Car getSubstitute() {
        return substitute;
    }

    public void setSubstitute(Car substitute) {
        this.substitute = substitute;
    }

    public Date getOutOfServiceUntil() {
        return outOfServiceUntil;
    }

    public void setOutOfServiceUntil(Date outOfServiceUntil) {
        this.outOfServiceUntil = outOfServiceUntil;
    }

    public void setState(CarState state) {
        this.state = state;
    }

    public boolean isAvailable() {
        return state instanceof InService;
    }
}