package ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class Refugio {
	private double liquidez;
	private final List<Animal> animalesRegistrados;
	private final List<Animal> animalesRefugiados;
	private final List<Donacion> donaciones;
	private final List<Socio> socios;
	
	public Refugio() {
		this.liquidez = 0;
		this.animalesRefugiados = new ArrayList<Animal>();
		this.animalesRegistrados = new ArrayList<Animal>();
		this.donaciones = new ArrayList<Donacion>();
	}
	
	protected void registrar(Animal animal) {
		animalesRegistrados.add(animal);
	}

}
