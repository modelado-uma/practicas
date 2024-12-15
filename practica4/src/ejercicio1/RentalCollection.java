package ejercicio1;

import java.util.*;

public class RentalCollection implements Iterable<Rental> {

	private List<Rental> rentals;
	
	public RentalCollection() {
		this.rentals = new ArrayList<>();
	}
	
	public void addRental(Rental rental) {
		rentals.add(rental);
	}
	
	public List<Rental> getRentals(){
		return rentals;
	}
	
	
	@Override
	public Iterator<Rental> iterator() {
		// TODO Auto-generated method stub
		return new RentalIterator(rentals);
	}

}
