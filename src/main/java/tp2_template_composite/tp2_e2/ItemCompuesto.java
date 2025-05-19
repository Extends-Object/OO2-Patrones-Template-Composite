package tp2_template_composite.tp2_e2;

import java.util.ArrayList;
import java.util.Collection;

public abstract class ItemCompuesto extends Item{

    protected Collection<Item> listaSubItems;

    public ItemCompuesto() {
        this.listaSubItems = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        listaSubItems.add(item);
    }

    @Override
    protected int calcularTiempoSubitems() {
        int total = 0;
        for (Item item : listaSubItems) {
            total += item.calcularTiempoFinalizacion(); //Empieza a delegar con recursion
        }
        return total;
    }
}

