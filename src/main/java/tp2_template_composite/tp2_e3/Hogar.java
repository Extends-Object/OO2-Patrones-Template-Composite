package tp2_template_composite.tp2_e3;

public class Hogar extends Seguro {

    public Hogar(double costo) {
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
