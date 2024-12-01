package ejercicio2;
import java.util.*;

enum EstadoAnimal {
	disponible, adoptado, enTratamiento;
}

public class Animal {
	private final Date nacimiento;
	private EstadoAnimal estado;
	private int id;
	
	public Animal(int id,Date nacimiento) {
		this.id = id;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Animal))
			return false;
		Animal other = (Animal) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + "]";
	}
	
	
	
}
