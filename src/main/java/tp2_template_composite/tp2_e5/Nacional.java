package tp2_template_composite.tp2_e5;

public class Nacional extends Remera {
    @Override
    protected double obtenerPorcentajeRecargo() {
        return 0.015;
    }

    @Override
    protected double obtenerPorcentajeBonificacion() {
        return 0.20;
    }

    @Override
    protected double obtenerPorcentajeComercio() {
        return 0.15;
    }

    /*
    @Override
    public double calcularPrecioVenta(double precioUnitario) {
        return precioUnitario - (precioUnitario * 0.035);
    }
    */
}
