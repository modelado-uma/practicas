package ejercicio1;

import java.util.Date;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Refugio refugio = new Refugio();
		
		Animal pantera = new Animal(1,new Date());
		Animal leon = new Animal(2,new Date());
		Animal perro = new Animal(3,new Date());
		
		//Voluntario registra animales
		Voluntario voluntario = new Voluntario(new Date(),refugio,10);
		voluntario.registrar(refugio, perro);
		voluntario.registrar(refugio, leon);
		voluntario.registrar(refugio, pantera);
		
		System.out.println("Los animales refugiados son:\n");
		System.out.println(refugio.getAnimalesRefugiados());
		
		System.out.println("\nLos animales registrados son:\n");
		System.out.println(refugio.getAnimalesRegistrados());
		
		

	}

}
