package ejercicio2;

import java.util.Date;

public class Adoptante implements IAdoptante{

	private Socio socio;

	public Adoptante(Socio s) {
		this.socio = s;
	}

	public void adoptar(Animal animal, Socio voluntario) {
		if(animal.getEstado() == EstadoAnimal.disponible) {
			System.out.println("El adoptante ha iniciado el proceso de adopción del animal: " + animal);
			voluntario.tramitarAdopcion(animal,this);
			
        } else {
            System.out.println("El animal no está disponible para adopción.");
        }
	}
	
	@Override
	public String toString() {
		return "Adoptante [id()=" + socio.getId() + "]";
	}

}
