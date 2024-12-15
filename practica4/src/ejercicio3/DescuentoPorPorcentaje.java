package ejercicio3;

public class DescuentoPorPorcentaje implements Descuento{
    double porcentaje;

    public DescuentoPorPorcentaje(double porcentaje){
        if (porcentaje <= 100.0 && porcentaje > 0.0){
            this.porcentaje = porcentaje;
        }else {
            System.out.println("Porcentaje indicado no válido");
        }
    }

    @Override
    public double aplicarDescuento(double precioBase) {
        return precioBase - precioBase*porcentaje/100;
    }
}
