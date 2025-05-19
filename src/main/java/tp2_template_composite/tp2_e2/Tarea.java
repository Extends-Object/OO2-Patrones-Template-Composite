package tp2_template_composite.tp2_e2;

public class Tarea extends Item{

    public Tarea(int tiempoRealizacion) {
        super(tiempoRealizacion);
    }

    @Override
    public int calcularTiempoFinalizacion() {
        return tiempoRealizacion;
    }
}
