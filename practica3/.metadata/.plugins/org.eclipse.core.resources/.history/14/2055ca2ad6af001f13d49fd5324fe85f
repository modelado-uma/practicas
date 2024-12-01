package ejercicio1;
import java.util.*;

enum EstadoAnimal {
	disponible, adoptado, enTratamiento;
}

public class Animal {
	private final Date nacimiento;
	private EstadoAnimal estado;
	
	public Animal(Date nacimiento) {
		this.nacimiento = nacimiento;
		this.estado = EstadoAnimal.disponible;
	}

	public Date getNacimiento() {
		return new Date(nacimiento.getTime());
	}

	public EstadoAnimal getEstado() {
		return estado;
	}

	void cambiarEstado(EstadoAnimal estado) {
		if(estado!=null) {
			this.estado = estado;
		} else {
			throw new IllegalArgumentException("El estado no puede ser nulo");
		}
	}
	
}
