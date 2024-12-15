package ejercicio2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear lista de coches
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("1234BCD", new Model("Model1", 50), "Office1"));
        cars.add(new Car("5678FGH", new Model("Model2", 70), "Office1"));
        cars.add(new Car("9101HJK", new Model("Model3", 60), "Office2"));

        // Seleccionar un coche y ponerlo fuera de servicio
        Car car = cars.get(0);
        Date backToServiceDate = new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000); // 7 días después
        car.takeOutOfService(backToServiceDate, cars);

        // Regresar el coche al servicio
        car.putInService();
        
        Car car2 = cars.get(1);
        Date backToServiceDate1 = new Date(System.currentTimeMillis() + 3 * 24 * 60 * 60 * 1000); // 3 días después
        car2.takeOutOfService(backToServiceDate1, cars);

        // Regresar el coche al servicio
        car2.putInService();
        
        //Comprobamos que esta en servicio
        car2.putInService();
    }
}
