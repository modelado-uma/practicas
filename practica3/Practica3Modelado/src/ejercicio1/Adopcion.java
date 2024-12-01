package ejercicio1;
import java.util.*;

public class Adopcion {
    private Date fecha;
    private Adoptante adoptantes;
    private List<Animal> animales;
    private Voluntario voluntario;
	
    public Adopcion(Date fecha, Adoptante adoptantes, Animal animal, Voluntario voluntario) {
		
		this.fecha = fecha;
		this.adoptantes = adoptantes;
		this.animales.add(animal);
		this.voluntario = voluntario;
	}
    
    public Adopcion(Date fecha, Adoptante adoptantes, List<Animal> animales, Voluntario voluntario) {
		super();
		this.fecha = fecha;
		this.adoptantes = adoptantes;
		this.animales = animales;
		this.voluntario = voluntario;
	}

	public Date getFecha() {
		return fecha;
	}

	public Adoptante getAdoptantes() {
		return adoptantes;
	}

	public List<Animal> getAnimales() {
		return animales;
	}

	public Voluntario getVoluntario() {
		return voluntario;
	}
    
    
    
    
    
    
    
    

    
}
