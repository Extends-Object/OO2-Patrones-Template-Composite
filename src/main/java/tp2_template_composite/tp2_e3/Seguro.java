package tp2_template_composite.tp2_e3;

public abstract class Seguro {

    protected double costo;

    public Seguro() {
    }

    public Seguro(double costo) {
        this.costo = costo;
    }

    public abstract double calcularCostoFinal();

    public abstract int contarHoja();
}
