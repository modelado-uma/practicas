package ejercicio2;

import java.util.*;

public class Donante implements IDonante {
	private Socio socio;
	private List<Donacion> donaciones;

	public Donante(Socio s){
		socio = s;
		donaciones = new ArrayList<Donacion>();
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
		return this.donaciones;
	}

	@Override
	public String toString() {
		return "Donante [id=" + socio.getId() + "]";
	}
}
