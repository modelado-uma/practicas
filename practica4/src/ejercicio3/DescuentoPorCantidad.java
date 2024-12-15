package ejercicio3;

public class DescuentoPorCantidad implements Descuento{
    double cantidad;
    public DescuentoPorCantidad(double cantidad){
        if (cantidad > 0){
            this.cantidad = cantidad;
        }else {
            System.out.println("Cantidad indicada no válida");
        }
    }
    @Override
    public double aplicarDescuento(double precioBase){
        if(precioBase < this.cantidad){
            return 0;
        }
        else{
            return precioBase - this.cantidad;
        }
    }
}
