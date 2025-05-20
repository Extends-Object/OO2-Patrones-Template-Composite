package tp2_template_composite.tp2_e3;

import java.util.Collection;

public class Paquete extends Seguro {

    private Collection<Seguro> listaItems;
    private int cantidad;

    public Paquete(Collection<Seguro> listaItem) {
        this.listaItems = listaItem;
        this.cantidad = 0;
    }

    @Override
    public double calcularCostoFinal() {
        double total = 0;
        for (Seguro item : listaItems) {
            total += item.calcularCostoFinal();
            cantidad += item.contarHoja();
        }
        double descuentoTotal = (cantidad * 0.05);
        return total - (total * descuentoTotal);
    }

    @Override
    public int contarHoja() {
        return 0;
    }
}
