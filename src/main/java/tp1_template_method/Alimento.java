package tp1_template_method;

public class Alimento extends Producto {

    public Alimento(double precio) {
        super(precio, 0.05, 0, false);
    }

    public Alimento(double precio, double impuestos, double descuentos, boolean envioGratis) {
        super(precio, 0.05, 0, false);
    }

    /*
    @Override
    public double precioFinal() {
        if (precio > 100) {
            descuentos = 0.15;
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
        if (precio > 100) {
            descuentos = 0.15;
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
