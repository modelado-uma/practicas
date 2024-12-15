package ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("1","Paquito");

        RentalOffice ofi1 = new RentalOffice("Calle palangreros",1);
        RentalOffice ofi2 = new RentalOffice("Calle Buenastardes",2);
        RentalOffice ofi3 = new RentalOffice("Calle buenasnoches",1);
        
        WebRental web2 = new WebRental(LocalDate.of(2025, 12, 25),LocalDate.of(2025, 12, 28),ofi1,5,ofi2);
        WebRental web1 = new WebRental(LocalDate.of(2024, 12, 25),LocalDate.of(2024, 12, 28),ofi1,5,ofi1);

        
        

        WebRental web3 = new WebRental(LocalDate.of(2026, 12, 25),LocalDate.of(2026, 12, 28),ofi2,5,ofi3);
        
        
        customer.addRental(web2);
        customer.addRental(web1);
        customer.addRental(web3);
        
        System.out.println(customer.numberOfRentalsWithDiffertentOffices());
        
        
        
        
        
        // Agregamos algunos Rentals
        /*customer.addRental(new Rental("2020-12-03","2020-12-05")); // No tiene deliveryOffice
        customer.addRental(new WebRental("Office1", "Office2")); // Diferentes oficinas
        customer.addRental(new WebRental("Office3", "Office3")); // Mismas oficinas

        System.out.println("Alquileres con oficinas diferentes: " +
            customer.numberOfRentalsWithDifferentOffices()); // Salida: 1*/
    }
}
