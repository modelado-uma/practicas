package ejercicio1;

import java.util.Date;

public class Adoptante extends Socio{

	public Adoptante(Date registro,Refugio ref,int id) {
		super(registro,ref,id);
	}
	
	

	public void adoptar(Animal animal, Voluntario voluntario) {
		if(animal.getEstado() == EstadoAnimal.disponible) {
			voluntario.tramitarAdopcion(animal,this);
			System.out.println("El adoptante ha iniciado el proceso de adopción del animal: " + animal.getNacimiento());
        } else {
            System.out.println("El animal no está disponible para adopción.");
        }
	}
	
	@Override
	public String toString() {
		return "Adoptante [id()=" + getId() + "]";
	}

}
