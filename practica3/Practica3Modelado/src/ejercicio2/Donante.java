package ejercicio2;

import ejercicio2.IDonante;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Donante implements IDonante {
	private Socio socio;
	private List<Donacion> donaciones;

	public Donante(Socio s){
		socio = s;
	}

	public void donar(double c){
		Date fecha = new Date();
		Donacion donacion = new Donacion(c, fecha);
		donaciones.add(donacion);
		Refugio ref = socio.getRefugio();
		double liquidez = ref.getLiquidez();
		ref.setLiquidez(liquidez + c);
		System.out.println("El donante ha donado " + c + " euros");
	}

	@Override
	public List<Donacion> getDonaciones() {
		return donaciones;
	}

	@Override
	public String toString() {
		return "Donante [id=" + socio.getId() + "]";
	}
}
