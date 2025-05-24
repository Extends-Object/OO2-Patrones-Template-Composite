package tp2_template_composite.tp2_e5;

public class Main {
    public static void main(String[] args) {

        Remera r1 = new Importado();
        Remera r2 = new Nacional();

        double precioR1 = r1.calcularPrecioVenta(3500);
        System.out.println(precioR1);

        double precioR2 = r2.calcularPrecioVenta(4750);
        System.out.println(precioR2);
    }
}
