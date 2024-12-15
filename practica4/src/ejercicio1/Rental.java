package ejercicio1;

import java.time.LocalDate;


public class Rental {
    private LocalDate startDate;
    private LocalDate endDate;
    private RentalOffice rentalOffice;
    

    public Rental(LocalDate startDate, LocalDate endDate, RentalOffice ofi){
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentalOffice = ofi;
        
        
    }
    
    
    
    

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public RentalOffice getRentalOffice() {
		return rentalOffice;
	}

	public void setRentalOffice(RentalOffice rentalOffice) {
		this.rentalOffice = rentalOffice;
	}

    
    
    
   

    
    

    

   

}