package tp2_template_composite.tp2_e1;

public class Main {
    public static void main(String[] args) {
    /*
    La empresa “Laser X” posee los siguientes roles de empleados: directores, gerentes,
    mandos medios, líderes de proyecto y empleados regulares. Todos tienen gente a su
    cargo, salvo los empleados regulares. Los directores tienen a su cargo gerentes, los
    gerentes a mandos medios, los mandos medios a líderes de proyecto y éstos a empleados regulares.

    En COMPOSITE = todos los elementos deben ser tratados como Empleado
        1. Armar la estructura jerarquica uniforme: si todos son del tipo Empleado, heredan el comportamiento.
        2. Cualquier metodo que calcule resultados a partir del compuesto, debe ser un metodo recursivo.
        3. El valor base debe ser el predeterminado o el que se debe sumar en cada llamada recursiva.
        4. Casos de test: ideal es que simulen jerarquias diferentes (uma mas simple y una mas profunda)

    */

        Empleado director = new Director(1000);
        Empleado gerente = new Gerente(950);
        Empleado mandoMedio = new MandoMedio(850);
        Empleado lider = new LiderProyecto(700);
        Empleado regular = new Regular(550);

        lider.agregarEmpleadoACargo(regular);
        mandoMedio.agregarEmpleadoACargo(lider);
        gerente.agregarEmpleadoACargo(mandoMedio);
        director.agregarEmpleadoACargo(gerente);

        Empresa empresa = new Empresa();
        empresa.agregarEmpleadoPrincipal(director);

        double resultado = empresa.calcularTotalSalarialEmpleados();

        System.out.println("El total salarial de la empresa es: $" + resultado);

    }
}
