import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp2_template_composite.tp2_e2.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TP2_e2_ProyectoTest {

    Item tarea1;
    Item tarea2;
    Item tarea3;
    Item spike1;
    Item spike2;
    HistoriaUsuario historiaUsuario1;
    HistoriaUsuario historiaUsuario2;
    HistoriaUsuario historiaUsuario3;
    Proyecto proyecto;

    @BeforeEach
    public void setUp(){
        tarea1 = new Tarea(13);
        tarea2 = new Tarea(9);
        tarea3 = new Tarea(15);

        spike1 = new Spike(11);
        spike2 = new Spike(12);

        historiaUsuario1 = new HistoriaUsuario();
        historiaUsuario2 = new HistoriaUsuario();
        historiaUsuario3 = new HistoriaUsuario();

        historiaUsuario1.agregarItem(tarea1);
        historiaUsuario1.agregarItem(tarea2);
        historiaUsuario1.agregarItem(spike1);

        historiaUsuario2.agregarItem(tarea2);
        historiaUsuario2.agregarItem(tarea3);
        historiaUsuario2.agregarItem(spike2);

        historiaUsuario3.agregarItem(tarea1);
        historiaUsuario3.agregarItem(tarea2);
        historiaUsuario3.agregarItem(tarea3);
        historiaUsuario3.agregarItem(spike1);
        historiaUsuario3.agregarItem(spike2);

        proyecto = new Proyecto();
        proyecto.agregarItem(historiaUsuario1);
        proyecto.agregarItem(historiaUsuario2);
        proyecto.agregarItem(historiaUsuario3);
    }

    @Test
    public void calcularTiempoFinalizacionProyectoTest(){

        int tiempoTotal = proyecto.calcularTiempoFinalizacion();

        assertEquals(129, tiempoTotal, "El tiempo calculado no es el estimado.");
    }
}
