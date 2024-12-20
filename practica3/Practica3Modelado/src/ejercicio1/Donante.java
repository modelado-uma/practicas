package ejercicio1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Donante extends Socio{

	private List<Donacion> donaciones;

	public Donante(Date registro, Refugio refugio,int id) {
		super(registro, refugio,id);
		donaciones = new ArrayList<Donacion>();
	}
	
	public void donar(Integer c){
		Date fecha = new Date();
		Donacion donacion = new Donacion(c, fecha);
		donaciones.add(donacion);
		Refugio ref = super.getRefugio();
		Double liquidez = ref.getLiquidez();
		ref.setLiquidez(liquidez + c);
		System.out.println("El donante ha donado " + c + " euros");
	}
	
	
	
	public List<Donacion> getDonaciones() {
		return donaciones;
	}

	@Override
	public String toString() {
		return "Donante [id=" + getId() + "]";
	}
}
