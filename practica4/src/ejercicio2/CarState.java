package ejercicio2;

import java.util.Date;
import java.util.List;

public interface CarState {
    void takeOutOfService(Car car, Date backToServiceDate, List<Car> cars);
    void putInService(Car car);
}