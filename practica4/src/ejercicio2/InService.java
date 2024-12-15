package ejercicio2;

import java.util.Date;
import java.util.List;

public class InService implements CarState {

    @Override
    public void takeOutOfService(Car car, Date backToServiceDate, List<Car> cars) {
        car.setOutOfServiceUntil(backToServiceDate);

        // Buscar un coche sustituto
        Car substitute = findSubstitute(car, cars);
        if (substitute != null) {
            car.setSubstitute(substitute);
        }

        // Cambiar el estado del coche a "fuera de servicio"
        car.setState(new OutOfService());
        System.out.println("Car " + car.getLicensePlate() + " is now out of service until: " + backToServiceDate);
        
        if (substitute != null) {
            System.out.println("Substitute car assigned: " + substitute.getLicensePlate());
        }
    }

    @Override
    public void putInService(Car car) {
        System.out.println("Car is already in service.");
    }

    // Método para buscar un sustituto
    private Car findSubstitute(Car car, List<Car> cars) {
        for (Car candidate : cars) {
            if (!candidate.equals(car) && candidate.isAvailable() &&
                candidate.getModel().equals(car.getModel()) &&
                candidate.getAssignedOffice().equals(car.getAssignedOffice())) {
                return candidate;
            }
        }
        return null; // No hay sustituto disponible
    }
}
