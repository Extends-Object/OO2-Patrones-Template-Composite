package tp2_template_composite.tp2_e3;

public class Medico extends Seguro {
    @Override
    public double calcularCostoFinal() {
        return costo;
    }

    @Override
    public int contarHoja() {
        return 1;
    }
}
