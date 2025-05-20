package tp2_template_composite.tp2_e3;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Seguro hogar = new Hogar(10500);
        Seguro auto = new Automovil(25500);
        Seguro vida = new Vida(15400);
        Seguro medico = new Medico(18250);      //Total = 69650     desc = 0.2      Final = 69650 - (69650 * 0.2)

        Collection<Seguro> listaSeguros_1 = new ArrayList<>();
        listaSeguros_1.add(hogar);
        listaSeguros_1.add(auto);
        Seguro paqueteSeguros_1 = new Paquete(listaSeguros_1);

        Collection<Seguro> listaSeguros_2 = new ArrayList<>();
        listaSeguros_2.add(vida);
        listaSeguros_2.add(paqueteSeguros_1); // paquete dentro de paquete
        Seguro paqueteSeguros_2 = new Paquete(listaSeguros_2);

        Collection<Seguro> listaSeguros_3 = new ArrayList<>();
        listaSeguros_3.add(medico);
        listaSeguros_3.add(paqueteSeguros_2);
        Seguro paqueteCompleto = new Paquete(listaSeguros_3);

        System.out.println("Costo final del paquete completo: $" + paqueteCompleto.calcularCostoFinal());

        Seguro hogar_A = new Hogar(8500);
        Seguro auto_A = new Automovil(3895);
        Seguro vida_A = new Vida(12322);

        //Caso paquete simple
        Collection<Seguro> listaItems_A = new ArrayList<>();
        listaItems_A.add(hogar_A);
        listaItems_A.add(auto_A);
        listaItems_A.add(vida_A);
        Seguro paquete_A = new Paquete(listaItems_A);

        System.out.println("Costo paquete 1: $" + paquete_A.calcularCostoFinal());

        //Caso de paquete compuesto
        Collection<Seguro> listaItems_B = new ArrayList<>();
        listaItems_B.add(paquete_A);
        listaItems_B.add(vida_A);
        Seguro paquete_B = new Paquete(listaItems_B);

        System.out.println("Costo paquete 2 (con paquete1 incluido): $" + paquete_B.calcularCostoFinal());
    }
}