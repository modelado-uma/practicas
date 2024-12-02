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
		voluntario.registrar(perro);
		voluntario.registrar(leon);
		voluntario.registrar(pantera);
		
		System.out.println("\nLos animales refugiados son:\n");
		System.out.println(refugio.getAnimalesRefugiados());
		
		System.out.println("\nLos animales registrados son:\n");
		System.out.println(refugio.getAnimalesRegistrados());
		
		//Adoptante adopta un animal
		Adoptante adoptante = new Adoptante(new Date(),refugio,15);
		adoptante.adoptar(pantera, voluntario);
		
		System.out.println("\nLos animales refugiados son:\n");
		System.out.println(refugio.getAnimalesRefugiados());
		
		System.out.println("\nLos animales registrados son:\n");
		System.out.println(refugio.getAnimalesRegistrados());
		
		//Donante realiza una donacion
		
		
		Donante donante = new Donante(new Date(),refugio,16);
		donante.donar(20);
		donante.donar(50);
		System.out.println("El donante " + donante + " ha realizado las siguientes donaciones:\n");
		System.out.println(donante.getDonaciones());
		
		System.out.println("El refugio tiene ahora una liquidez de: " + refugio.getLiquidez() + "€");

	}

}
