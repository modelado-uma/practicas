package ejercicio1;

import java.util.Date;

public class Voluntario extends Socio{

	public Voluntario(Date registro,Refugio ref,int id) {
		super(registro,ref,id);
	}
	
	public void registrar(Refugio refugio, Animal animal) {
		refugio.registrar(animal);
		System.out.println("Animal registrado en el refugio por el voluntario");
	}
	
	protected void tramitarAdopcion(Animal animal, Adoptante adoptante) {
		if(animal.getEstado() == EstadoAnimal.disponible) {
			animal.cambiarEstado(EstadoAnimal.adoptado);
			super.getRefugio().removeAnimalAdoptado(animal);
			
			System.out.println("Animal adoptado por " + adoptante);
		} else {
            System.out.println("El animal no está disponible para adopción.");
        }
	}

	@Override
	public String toString() {
		return "Voluntario [id()=" + getId() + "]";
	}
}
