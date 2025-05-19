package tp2_template_composite.tp2_e2;

import java.util.ArrayList;
import java.util.Collection;

public class Proyecto {

    private Collection<Item> listaHistoriasUsuario;

    public Proyecto() {
        this.listaHistoriasUsuario = new ArrayList<>();
    }

    public void agregarItem(Item historiaUsuario){
        this.listaHistoriasUsuario.add(historiaUsuario);
    }

    public int calcularTiempoFinalizacion (){
        int tiempoEnDias = 0;
        for(Item historiaUsuario : listaHistoriasUsuario){
            tiempoEnDias += historiaUsuario.calcularTiempoFinalizacion();
        }
        return tiempoEnDias;
    }

}