import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp2_template_composite.tp2_e1.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TP2_e1_EmpleadoTest {

    Empleado director;

    Empleado gerente1;
    Empleado gerente2;

    Empleado mandoMedio1;
    Empleado mandoMedio2;

    Empleado lider1;
    Empleado lider2;

    Empleado regular1;
    Empleado regular2;
    Empleado regular3;

    Empresa empresa;

    @BeforeEach
    public void setUp(){
        director = new Director(1550);

        gerente1 = new Gerente(975);
        gerente2 = new Gerente(975);

        mandoMedio1 = new MandoMedio(890);
        mandoMedio2 = new MandoMedio(890);

        lider1 = new LiderProyecto(720);
        lider2 = new LiderProyecto(720);

        regular1 = new Regular(560);
        regular2 = new Regular(560);
        regular3 = new Regular(560);

        empresa = new Empresa();

        lider1.agregarEmpleadoACargo(regular1);
        lider1.agregarEmpleadoACargo(regular2);
        lider1.agregarEmpleadoACargo(regular3);

        mandoMedio1.agregarEmpleadoACargo(lider1);
        mandoMedio2.agregarEmpleadoACargo(lider2);

        gerente1.agregarEmpleadoACargo(mandoMedio1);
        gerente2.agregarEmpleadoACargo(mandoMedio2);

        director.agregarEmpleadoACargo(gerente1);
        director.agregarEmpleadoACargo(gerente2);

        empresa.agregarEmpleadoPrincipal(director);
    }

    @Test
    public void calcularTotalSalarialEmpleados_test(){

        double resultado = empresa.calcularTotalSalarialEmpleados();

        assertEquals(8400, resultado, "El resultado de la suma de salarios no es la correcta.");
    }

    @Test
    public void calcularSalarioEmpleadosACargo_Lider1_test() {

        double resultado = lider1.calcularTotalSalarialEmpleadosACargo();

        assertEquals(2400, resultado, "El resultado de la suma de salarios no es la correcta.");
    }
}
