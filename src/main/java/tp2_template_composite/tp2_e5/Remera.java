package tp2_template_composite.tp2_e5;

public abstract class Remera {

    public final double calcularPrecioVenta(double precioUnitario) {

        double totalConRecargo = precioUnitario + (precioUnitario * obtenerPorcentajeRecargo());
        double conBonificacionAplicada = totalConRecargo - (totalConRecargo * obtenerPorcentajeBonificacion());
        double total = conBonificacionAplicada + (conBonificacionAplicada * obtenerPorcentajeComercio());

        return total;
    }

    protected abstract double obtenerPorcentajeRecargo();

    protected abstract double obtenerPorcentajeBonificacion();

    protected abstract double obtenerPorcentajeComercio();

}
