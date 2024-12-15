package ejercicio1;

import java.util.Objects;

public class RentalOffice {

	
	private String address;
	private int feeForDelivery;
	
	public RentalOffice(String ad,int fee) {
		this.address = ad;
		this.feeForDelivery = fee;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof RentalOffice))
			return false;
		RentalOffice other = (RentalOffice) obj;
		return this.getAddress().equalsIgnoreCase(other.getAddress());
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFeeForDelivery() {
		return feeForDelivery;
	}

	public void setFeeForDelivery(int feeForDelivery) {
		this.feeForDelivery = feeForDelivery;
	}
	
	
	
}
