package tp2_template_composite.tp2_e4;

public class CalculadorJubilado extends Calculador {

    //private LogTransaction log;

    public CalculadorJubilado(int mesPromocion) {
        super(mesPromocion);
    }

    @Override
    protected double calcularIVA(double precioProducto) {
        if (!esMesPromocion()) {
            System.out.println("No es mes de promocion.");
            System.out.println("IVA: $" + precioProducto * 0.1);
            return precioProducto * 0.1;
        }
        System.out.println("Es mes de promocion.");
        System.out.println("IVA: $" + precioProducto * 0);
        return 0;
    }


    /*
    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * 0.1;
        }
        //log.log(CalculadorJubilado.class.getName());
        return precioTotal;
    }


    LogTransaction ---> Se usa para dejar trazas (por ej en consola o archivo) que permitan rastrear la ejecución programa
    log.log(CalculadorJubilado.class.getName()); ---> Devuelve el nombre completo de la clase en tiempo de ejecución

    */
}