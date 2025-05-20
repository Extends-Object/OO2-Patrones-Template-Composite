package tp2_template_composite.tp2_e3;

public class Automovil extends Seguro {
    @Override
    public double calcularCostoFinal() {
        return costo;
    }

    @Override
    public int contarHoja() {
        return 1;
    }
}
