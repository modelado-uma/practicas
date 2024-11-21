package ejercicio1;

import java.util.Date;

public class Donante extends Socio{

	public Donante(Date registro) {
		super(registro);
		// TODO Auto-generated constructor stub
	}
	public void donar(Integer c){
		Date fecha = new Date();
		Donacion donacion = new Donacion(c, fecha);
		donacion.registrarDonacion(c);
		System.out.println("El donante ha donado " + c + " euros");
	}
}
