package ejercicio2;

import java.util.Date;
import java.util.List;

public class OutOfService implements CarState {

    @Override
    public void takeOutOfService(Car car, Date backToServiceDate, List<Car> cars) {
        System.out.println("Car " + car.getLicensePlate() + " is already out of service.");
    }

    @Override
    public void putInService(Car car) {
        car.setOutOfServiceUntil(null);
        car.setSubstitute(null);
        car.setState(new InService());
        System.out.println("Car " + car.getLicensePlate() + " is now back in service.");
    }
}