package ejercicio2;
import java.util.*;

public class Socio{
	private int id;
	private final Date registro;
	private final Refugio refugio;

	private IVoluntario rolVoluntario;
	private IAdoptante rolAdoptante;
	private IDonante rolDonante;

	public Socio (Date registro, Refugio refugio, int id) {
		this.registro = registro;
		this.refugio = refugio;
		this.refugio.addSocio(this);
		this.id = id;
	}

	public void asignarVoluntario(IVoluntario voluntario){
		this.rolVoluntario = voluntario;
	}
	public void asignarAdoptante(IAdoptante adoptante){
		this.rolAdoptante = adoptante;
	}
	public void asignarDonante(IDonante donante){
		this.rolDonante = donante;
	}

	public boolean isAdoptante(){
		return rolAdoptante != null;
	}

	public boolean isDonante(){
		return rolDonante != null;
	}

	public boolean isVoluntario(){
		return rolVoluntario != null;
	}

	public void adoptar(Animal a, Socio v){
		if (rolAdoptante != null && v.isVoluntario()) {
			this.rolAdoptante.adoptar(a,v);

		}else{
			if(rolAdoptante != null){
				System.out.println("El socio " + this.getId() + " no es Adoptante");
			}else{
				System.out.println("El socio " + v.getId() + " no es Voluntario");
			}
		}
	}

	public void tramitarAdopcion(Animal animal, Adoptante adoptante) {
		if (rolVoluntario != null) {
			rolVoluntario.tramitarAdopcion(animal,adoptante);
		} else {
			System.out.println("El socio " + this.getId() + " no es Voluntario");
		}
	}

	public void registrar(Animal a) {
		if(rolVoluntario != null){
			rolVoluntario.registrar(a);
		}else{
			System.out.println("El socio " + this.getId() + " no es Voluntario");
		}
	}

	public void donar(double cantidad) {
		if (rolDonante != null) {
			rolDonante.donar(cantidad);
		} else {
			System.out.println("El socio " + this.getId() + " no es Donante");
		}
	}

	public List <Donacion> getDonaciones(){
		if(rolDonante != null){
			return this.rolDonante.getDonaciones();
		}else{
			System.out.println("El socio " + this + " no es donante, por lo que no tiene donaciones realizadas");
			return null;
		}


	}


	public Date getRegistro() {
		return this.registro;
	}
	public Refugio getRefugio() {
		return this.refugio;
	}
	
	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + "]";
	}
	
	
}
