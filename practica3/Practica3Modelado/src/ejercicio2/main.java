package ejercicio2;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        Refugio patitasContentas = new Refugio();

        Animal pantera = new Animal(1,new Date());
        Animal leon = new Animal(2,new Date());
        Animal perro = new Animal(3,new Date());

        Socio socio = new Socio(new Date(), patitasContentas, 15);
        socio.asignarAdoptante(new Adoptante(socio));
        socio.asignarVoluntario(new Voluntario(socio));


        Socio socio2 = new Socio(new Date(), patitasContentas, 16);
        socio2.asignarDonante(new Donante(socio2));
        socio2.asignarAdoptante(new Adoptante(socio2));

        //socio es Adoptante y Voluntario, por lo que puede registrar animales y
        // adoptar

        //socio2 no es Voluntario, por lo que no puede registrar nuevos animales

        //PROBAMOS registrar
        socio.registrar(leon);
        socio.registrar(perro);

        socio2.registrar(pantera);

        System.out.println("Animales registrados:\n" + patitasContentas.getAnimalesRegistrados());
        System.out.println("\nAnimales Refugiados:\n" + patitasContentas.getAnimalesRefugiados());

        //PROBAMOS adoptar
        socio2.adoptar(leon,socio);
        socio.adoptar(perro,socio2); //Este esta hecho para fallar
        System.out.println("\nAnimales registrados:\n" + patitasContentas.getAnimalesRegistrados());
        System.out.println("\nAnimales Refugiados:\n" + patitasContentas.getAnimalesRefugiados());



        //PROBAMOS donar
        socio2.donar(50);
        socio2.getDonaciones();
        System.out.println("Las donaciones realizadas por " + socio2 + "son:\n " + socio2.getDonaciones());



    }
}
