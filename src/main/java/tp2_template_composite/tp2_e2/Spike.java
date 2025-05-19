package tp2_template_composite.tp2_e2;

public class Spike extends Item{

    public Spike(int tiempoRealizacion) {
        super(tiempoRealizacion);
    }

    @Override
    protected int calcularTiempoSubitems() {
        return tiempoRealizacion;
    }

    /*
    public class Spike extends Item{

    public Spike(int tiempoRealizacion) {
        super(tiempoRealizacion);
    }

    @Override
    public int calcularTiempoFinalizacion() {
        return tiempoRealizacion;
    }
    */
}
