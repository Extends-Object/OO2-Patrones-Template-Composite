package tp2_template_composite.tp2_e4;

public class CalculadorNoJubilado extends Calculador {

    //private LogTransaction log;

    public CalculadorNoJubilado(int mesPromocion) {
        super(mesPromocion);
    }

    @Override
    protected double calcularIVA(double precioProducto) {
        if (esMesPromocion()) {
            System.out.println("Es mes de promocion.");
            System.out.println("IVA: $" + precioProducto * 0.15);
            return precioProducto * 0.15;
        }
        System.out.println("No es mes de promocion.");
        System.out.println("IVA: $" + precioProducto * 0.21);
        return precioProducto * 0.21;
    }


    /*
    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {      //esta sumando el iva
            precioTotal += precioProducto * 0.15;
        } else {
            precioTotal += precioProducto * 0.21;
        }
        //log.log(CalculadorNoJubilado.class.getName());
        return precioTotal;
    }
    */
}