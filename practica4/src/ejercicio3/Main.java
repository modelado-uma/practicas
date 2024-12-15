package ejercicio3;


import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Car carro = new Car("2055HVL", new Model("BM", 100));
		System.out.println("Modelo: " + carro.getModel().getModel());

		Rental alquilerDeJose = new Rental(LocalDate.of(2021,10,1),LocalDate.of(2021, 10, 2), carro, new DescuentoPorPorcentaje(10));
		System.out.println("Dias: " + alquilerDeJose.getTotalDays());
		System.out.println("Precio: " + alquilerDeJose.getPrice());

		Rental alquiler2 = new Rental(LocalDate.of(2021,10,1),LocalDate.of(2021, 10, 2), carro, new DescuentoPorCantidad(1000));
		System.out.println(alquiler2.getPrice());
	}
}
