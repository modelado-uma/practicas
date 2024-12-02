package ejercicio2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Voluntario implements IVoluntario{

	private List<Adopcion> tramites;
	Socio socio;

	public Voluntario(Socio s) {
		socio = s;
		this.tramites = new ArrayList<Adopcion>();
	}

	public void registrar(Animal animal) {
		socio.getRefugio().registrar(animal);
		System.out.println("Animal registrado en el refugio por el voluntario");
	}

	public void tramitarAdopcion(Animal animal, Adoptante adoptante) {
		if(animal.getEstado() == EstadoAnimal.disponible) {
			animal.cambiarEstado(EstadoAnimal.adoptado);
			socio.getRefugio().removeAnimalAdoptado(animal);
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
		return "Voluntario [id()=" + socio.getId() + "]";
	}
}
