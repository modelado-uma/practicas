package ejercicio1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Voluntario extends Socio{

	private List<Adopcion> tramites;
	
	public Voluntario(Date registro,Refugio ref,int id) {
		super(registro,ref,id);
		tramites = new ArrayList<Adopcion>();
	}
	
	public void registrar(Refugio refugio, Animal animal) {
		refugio.registrar(animal);
		System.out.println("Animal registrado en el refugio por el voluntario");
	}
	
	protected void tramitarAdopcion(Animal animal, Adoptante adoptante) {
		if(animal.getEstado() == EstadoAnimal.disponible) {
			animal.cambiarEstado(EstadoAnimal.adoptado);
			super.getRefugio().removeAnimalAdoptado(animal);
			Adopcion nuevaAdopcion = new Adopcion(new Date(),adoptante,animal,this);
			
			addTramites(nuevaAdopcion);
			
			System.out.println("Animal adoptado por " + adoptante);
		} else {
            System.out.println("El animal no está disponible para adopción.");
        }
	}

	
	
	
	public List<Adopcion> getTramites() {
		return tramites;
	}

	public void setTramites(List<Adopcion> tramites) {
		this.tramites = tramites;
	}
	
	public void addTramites(Adopcion adopcion) {
		this.tramites.add(adopcion);
	}

	@Override
	public String toString() {
		return "Voluntario [id()=" + getId() + "]";
	}
}
