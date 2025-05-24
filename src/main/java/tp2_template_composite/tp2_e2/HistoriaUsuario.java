package tp2_template_composite.tp2_e2;

public class HistoriaUsuario extends ItemCompuesto {

    public HistoriaUsuario() {
        super();
    }

    /*
    - Mantener la estructura actual? ---> Tarea y Spike no deberían agregar ítems (pero igual pueden)
    - Collection<Item> y el metod agregarItem los paso a aca para que solo esta clase actúe como Composite


    public class HistoriaUsuario extends Item{

        private Collection<Item> listaTareas;

        public HistoriaUsuario() {
            this.listaTareas = new ArrayList<>();
        }

        public void agregarItem(Item tarea){
            this.listaTareas.add(tarea);
        }

        @Override
        public int calcularTiempoFinalizacion() {
            int tiempoEnDias = 0;
            for(Item tarea : listaTareas){
                tiempoEnDias += tarea.calcularTiempoFinalizacion();
            }
            return tiempoEnDias;
        }
    */

}