package ejercicio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental {
    private LocalDate startDate;
    private LocalDate endDate;
    private Car car;
    private Descuento descuento;

    public Rental(LocalDate startDate, LocalDate endDate, Car car){
        this.startDate = startDate;
        this.endDate = endDate;
        this.car = car;
    }

    public Rental(LocalDate startDate, LocalDate endDate, Car car, Descuento descuento){
        this.startDate = startDate;
        this.endDate = endDate;
        this.car = car;
        this.descuento = descuento;
    }

    public void aplicarDescuento(Descuento descuento){
        this.descuento = descuento;
    }
    public void quitarDescuento(){
        this.descuento = null;
    }

    public long getTotalDays(){
        return ChronoUnit.DAYS.between(this.startDate, this.endDate);
    }

    public Integer getPrice(){
        int basePrice = (int) getTotalDays() * this.car.getModel().getPricePerDay();
        if (this.descuento != null){
            return (int) this.descuento.aplicarDescuento(basePrice);
        }else{
            return (int) basePrice;
        }
    }

}
