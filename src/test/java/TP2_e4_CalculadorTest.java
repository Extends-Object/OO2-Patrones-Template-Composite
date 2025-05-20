import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp2_template_composite.tp2_e4.Calculador;
import tp2_template_composite.tp2_e4.CalculadorJubilado;
import tp2_template_composite.tp2_e4.CalculadorNoJubilado;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TP2_e4_CalculadorTest {
    Calculador calculadorIVA_1;
    Calculador calculadorIVA_2;
    Calculador calculadorIVA_3;
    Calculador calculadorIVA_4;
    double precioProducto_1;
    double precioProducto_2;

    @BeforeEach
    public void setUp() {
        calculadorIVA_1 = new CalculadorJubilado(4);
        calculadorIVA_2 = new CalculadorJubilado(5);

        calculadorIVA_3 = new CalculadorNoJubilado(10);
        calculadorIVA_4 = new CalculadorNoJubilado(5);

        precioProducto_1 = 15;
        precioProducto_2 = 20;
    }

    @Test
    public void calcularIvaJubilados() {

        double precioFinalSinPromocion_J = calculadorIVA_1.calcularPrecioTotal(precioProducto_1);
        double precioFinalPromocion_J = calculadorIVA_2.calcularPrecioTotal(precioProducto_1);


        assertEquals(16.5, precioFinalSinPromocion_J, "El precio calculado no es el correcto.");
        assertEquals(15, precioFinalPromocion_J, "El precio calculado no es el correcto.");

    }

    @Test
    public void calcularIvaNoJubilados() {

        double precioFinalSinPromocion_NJ = calculadorIVA_3.calcularPrecioTotal(precioProducto_2);
        double precioFinalPromocion_NJ = calculadorIVA_4.calcularPrecioTotal(precioProducto_2);

        assertEquals(24.2, precioFinalSinPromocion_NJ, "El precio calculado no es el correcto.");
        assertEquals(23, precioFinalPromocion_NJ, "El precio calculado no es el correcto.");
    }
}
