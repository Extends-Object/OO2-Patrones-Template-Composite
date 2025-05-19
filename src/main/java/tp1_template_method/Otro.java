package tp1_template_method;

public class Otro extends Producto {

    public Otro(double precio) {
        super(precio, 0.15, 0, false);
    }

    public Otro(double precio, double impuestos, double descuentos, boolean envioGratis) {
        super(precio, 0.15, 0, false);
    }

    /*
    @Override
    public double precioFinal() {
        if (precio > 50) {
            descuentos = 0.05;
        }

        double total = precio * (1 + impuestos) * (1 - descuentos);

        if (precio > 200) {
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
            descuentos = 0.05;
        }
        return 1 - descuentos;
    }

    @Override
    protected boolean tieneEnvioGratis() {

        /*
        if (precio > 200) {
            return envioGratis = true;
        }
        return envioGratis;
        */

        return precio > 200;
    }
}
