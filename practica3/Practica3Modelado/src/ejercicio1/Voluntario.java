package ejercicio1;

import java.util.Date;

public class Voluntario extends Socio{

	public Voluntario(Date registro) {
		super(registro);
	}
	
	public void registrarAnimal(Refugio refugio, Animal animal) {
		refugio.registrarAnimal(animal);
		System.out.println("Animal registrado en el refugio por el voluntario");
	}
	
	protected void tramitarAdopcion(Animal animal, Adoptante adoptante) {
		if(animal.getEstado() == EstadoAnimal.disponible) {
			animal.cambiarEstado(EstadoAnimal.adoptado);
			System.out.println("Animal adoptado por " + adoptante);
		} else {
            System.out.println("El animal no está disponible para adopción.");
        }
	}
}
