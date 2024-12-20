package ejercicio1;
import java.util.*;

public class Socio {
	private int id;
	private final Date registro;
	private final Refugio refugio;
	
	public Socio (Date registro, Refugio refugio, int id) {
		this.registro = registro;
		this.refugio = refugio;
		this.refugio.addSocio(this);
		this.id = id;
		
		
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
