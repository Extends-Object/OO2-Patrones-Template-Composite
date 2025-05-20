package tp2_template_composite.tp2_e4;

public class Main {
    public static void main(String[] args) {

        Calculador calculadorIVA = new CalculadorJubilado(4);
        double precioProducto = 15.45;
        double precioConIva = calculadorIVA.calcularPrecioTotal(precioProducto);
        System.out.println("El precio con IVA incluido (teniendo en cuenta si/no mes de promocion) es: $" + precioConIva + "\n");

        Calculador calculadorIVA_2 = new CalculadorNoJubilado(5);
        double precioProducto2 = 20;
        double precioConIva2 = calculadorIVA_2.calcularPrecioTotal(precioProducto2);
        System.out.println("El precio con IVA incluido (teniendo en cuenta si/no mes de promocion) es: $" + precioConIva2 + "\n");

        Calculador calculadorIVA_3 = new CalculadorJubilado(5);
        double precioProducto3 = 10;
        double precioConIva3 = calculadorIVA_3.calcularPrecioTotal(precioProducto);
        System.out.println("El precio con IVA incluido (teniendo en cuenta si/no mes de promocion) es: $" + precioConIva3 + "\n");
    }
}
