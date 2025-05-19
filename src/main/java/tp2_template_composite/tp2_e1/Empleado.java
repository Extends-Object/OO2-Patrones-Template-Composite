package tp2_template_composite.tp2_e1;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Empleado {

   protected double salario;
   protected Collection<Empleado> listaEmpleadosACargo;

   public Empleado(double salario) {
      this.salario = salario;
      this.listaEmpleadosACargo = new ArrayList<>();
   }

   public void agregarEmpleadoACargo(Empleado e) {
      listaEmpleadosACargo.add(e);
   }

   public double calcularTotalSalarialEmpleadosACargo(){
      double total = salario;
      for (Empleado empleado : listaEmpleadosACargo){
         total += empleado.calcularTotalSalarialEmpleadosACargo();
      }
      return total;
   }
}
