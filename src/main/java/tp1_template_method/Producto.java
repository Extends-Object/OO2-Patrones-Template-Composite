package tp1_template_method;

public abstract class Producto {

    protected double precio;
    protected double impuestos;
    protected double descuentos;
    protected boolean envioGratis;

    public Producto(double precio, double impuestos, double descuentos, boolean envioGratis) {
        this.precio = precio;
        this.impuestos = impuestos;
        this.descuentos = descuentos;
        this.envioGratis = envioGratis;
    }

    //public abstract double precioFinal();

    public final double precioFinal(){

        double total = precio * calcularImpuestos() * calcularDescuentos();

        if(tieneEnvioGratis()){
            total -= 10;
        }

        return total;
    }

    protected abstract double calcularImpuestos();
    protected abstract double calcularDescuentos();
    protected abstract boolean tieneEnvioGratis();
}