package tp2_template_composite.tp2_e4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

    protected int mesPromocion;

    public Calculador(int mesPromocion) {
        this.mesPromocion = mesPromocion;
    }

    public final double calcularPrecioTotal(double precioProducto) {
        return precioProducto + calcularIVA(precioProducto);
    }

    protected abstract double calcularIVA(double precioProducto);

    protected boolean esMesPromocion() {
        return of(mesPromocion).equals(now().getMonth());
    }

    //public abstract double calcularPrecio(double precioProducto);

}