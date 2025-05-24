package tp2_template_composite.tp2_e5;

public class Importado extends Remera {
    @Override
    protected double obtenerPorcentajeRecargo() {
        return 0.03 + 0.05;
    }

    @Override
    protected double obtenerPorcentajeBonificacion() {
        return 0;
    }

    @Override
    protected double obtenerPorcentajeComercio() {
        return 0.25;
    }

    /*
    @Override
    public double calcularPrecioVenta(double precioUnitario) {
        return precioUnitario + (precioUnitario * 0.33);
    }
    */
}
