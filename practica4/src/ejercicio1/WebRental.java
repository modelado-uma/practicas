package ejercicio1;

import java.time.LocalDate;

public class WebRental extends Rental {

	
	private int deliveryTime;
	private RentalOffice deliveryOffice;
	
	public WebRental(LocalDate startDate, LocalDate endDate, RentalOffice ofi, int deliveryTime, RentalOffice delivery) {
		super(startDate, endDate, ofi);
		this.deliveryTime = deliveryTime;
		this.deliveryOffice = delivery;
	}

	public int getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	
	public RentalOffice getDeliveryOffice() {
		return deliveryOffice;
	}

	public boolean sameOffices() {
		return this.getDeliveryOffice().equals(super.getRentalOffice());
	}
	
}
