package ejercicio1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Donante extends Socio{

	private List<Donacion> donaciones;

	public Donante(Date registro, Refugio refugio) {
		super(registro, refugio);
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
}
