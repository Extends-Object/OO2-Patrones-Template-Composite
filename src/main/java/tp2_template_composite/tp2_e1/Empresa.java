package tp2_template_composite.tp2_e1;

import java.util.ArrayList;
import java.util.Collection;

public class Empresa {

    private Collection<Empleado> listaEmpleadosPrincipales;

    public Empresa() {
        this.listaEmpleadosPrincipales = new ArrayList<>();
    }

    public void agregarEmpleadoPrincipal(Empleado empleado) {
        listaEmpleadosPrincipales.add(empleado);
    }

    public double calcularTotalSalarialEmpleados(){
        double total = 0;           //aca la cuenta arranca de cero
        for (Empleado empleado : listaEmpleadosPrincipales){
            total += empleado.calcularTotalSalarialEmpleadosACargo();
        }
        return total;
    }
}
