package ejercicio1;

import java.util.*;

public class RentalIterator implements Iterator<Rental> {

	private List<Rental> rentals;
	
	private int currentPosition = 0;
	
	public RentalIterator(List<Rental> rentals) {
		this.rentals = rentals;
	}
	
	
	
	public int getCurrentPosition() {
		return currentPosition;
	}



	public List<Rental> getRentals() {
		return rentals;
	}



	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.currentPosition < this.getRentals().size();
	}

	@Override
	public Rental next() {
		
		return hasNext() ? rentals.get(currentPosition++) : null;
	}
	
}
