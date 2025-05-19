package tp2_template_composite.tp2_e2;

public abstract class Item {

    int tiempoRealizacion;

    public Item() {
    }

    public Item(int tiempoRealizacion) {
        this.tiempoRealizacion = tiempoRealizacion;
    }

    public abstract int calcularTiempoFinalizacion ();

}