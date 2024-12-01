package ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class Refugio {
	private double liquidez;
	private List<Animal> animalesRegistrados;
	private List<Animal> animalesRefugiados;
	private final List<Socio> socios;
	
	public Refugio() {
		this.liquidez = 0;
		this.animalesRefugiados = new ArrayList<Animal>();
		this.animalesRegistrados = new ArrayList<Animal>();
		this.socios = new ArrayList<Socio>();
		
	}
	
	protected void registrar(Animal animal) {
		//Nos aseguramos de que que el estado del animal sea 'disponible' y lo registramos
		if(animal.getEstado() != EstadoAnimal.disponible) {
			animal.cambiarEstado(EstadoAnimal.disponible);
		}
		
		animalesRegistrados.add(animal);
		animalesRefugiados.add(animal);
	}

	public double getLiquidez() {
		return liquidez;
	}

	public void setLiquidez(double liquidez) {
		this.liquidez = liquidez;
	}

	public List<Animal> getAnimalesRefugiados() {
		return animalesRefugiados;
	}

	public List<Animal> getAnimalesRegistrados() {
		return animalesRegistrados;
	}

	public void setAnimalesRegistrados(List<Animal> listaNew){
		this.animalesRegistrados = listaNew;
	}

	public void setAnimalesRefugiados(List<Animal> animalesRefugiados) {
		this.animalesRefugiados = animalesRefugiados;
	}
	
	public void addSocio(Socio x) {
		this.socios.add(x);
	}
	
	public void removeAnimalAdoptado(Animal x) {
		this.animalesRefugiados.remove(x);
	}
}

