package ejercicio1;

import java.util.*;

public class Donacion {
    private double cantidad;
    private Date fecha;


    public Donacion(double cant,Date fecha){
        this.cantidad = cant;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

	@Override
	public String toString() {
		return "Donacion [cantidad=" + cantidad + ", fecha=" + fecha + "]";
	}
}
