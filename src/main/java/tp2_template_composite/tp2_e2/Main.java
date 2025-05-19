package tp2_template_composite.tp2_e2;

public class Main {
    public static void main(String[] args) {

        /*
        Resaltar:
        a. Item es el componente abstracto.
        b. HistoriaUsuario es un composite porque se compone de tareas.
        c. Tarea y Spike son hojas porque no se componen de nada.

        */

        Item tarea = new Tarea(13);
        Item spike = new Spike(11);
        HistoriaUsuario historiaUsuario = new HistoriaUsuario();

        historiaUsuario.agregarItem(tarea);
        historiaUsuario.agregarItem(spike);

        Proyecto proyecto = new Proyecto();
        proyecto.agregarItem(historiaUsuario);

        int tiempoRealizacion = proyecto.calcularTiempoFinalizacion();
        System.out.println("El tiempo de finalizacion del proyecto es de " + tiempoRealizacion + " dias.");
    }
}
