package ejercicio1;

import java.util.*;

public class Customer {

	private String dni;
	private String name;
	private RentalCollection rentalCollection;
	
	
	
	public Customer(String dni,String name) {
		this.dni = dni;
		this.name = name;
		this.rentalCollection = new RentalCollection();
	}

	
	public void addRental(Rental rental) {
		this.rentalCollection.addRental(rental);
	}

	public int numberOfRentalsWithDiffertentOffices() {
		int contador = 0;
		Iterator<Rental> iterator = rentalCollection.iterator();
		
		while(iterator.hasNext()) {
			Rental rental = iterator.next();
			
			if(rental instanceof WebRental) {
				WebRental webrental = (WebRental) rental;
				if(!webrental.sameOffices()) {
					contador++;
				}
			}
		}
		
		
		
		
		return contador;
	}
	
	

}
