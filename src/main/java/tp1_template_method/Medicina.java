package tp1_template_method;

public class Medicina extends Producto {

    public Medicina(double precio) {
        super(precio, 0, 0, false);
    }

    public Medicina(double precio, double impuestos, double descuentos, boolean envioGratis) {
        super(precio, 0, 0, false);
    }

    /*
    @Override
    public double precioFinal() {
        if (precio > 50) {
            descuentos = 0.1;
        }

        double total = precio * (1 + impuestos) * (1 - descuentos);

        if (precio > 100) {
            envioGratis = true;
            total -= 10;
        }
        return total;
    }
    */

    @Override
    protected double calcularImpuestos() {
        return 1 + impuestos;
    }

    @Override
    protected double calcularDescuentos() {
        if (precio > 50) {
            descuentos = 0.1;
        }
        return 1 - descuentos;
    }

    @Override
    protected boolean tieneEnvioGratis() {
        /*
        if (precio > 100) {
            return envioGratis = true;
        }
        return envioGratis;
        */

        return precio > 100;
    }
}
