package tp1_template_method;

public class Libro extends Producto {

    public Libro(double precio) {
        super(precio, 0.1, 0.1, false);
    }

    public Libro(double precio, double impuestos, double descuentos, boolean envioGratis) {
        super(precio, 0.1, 0.1, false);
    }

    /*
    @Override
    public double precioFinal() {
        double total = precio * (1 + impuestos) * (1 - descuentos);

        if(precio > 100){
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
        return 1 - descuentos;
    }

    @Override
    protected boolean tieneEnvioGratis() {
        /*
        if(precio > 100) {
            return envioGratis = true;
        }
        return envioGratis;
        */

        return precio > 100;
    }
}
