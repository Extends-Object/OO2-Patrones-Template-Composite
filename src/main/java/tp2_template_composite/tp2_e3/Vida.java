package tp2_template_composite.tp2_e3;

public class Vida extends Seguro {

    public Vida(double costo) {
        super(costo);
    }

    @Override
    public double calcularCostoFinal() {
        return costo;
    }

    @Override
    public int contarHoja() {
        return 1;
    }
}
