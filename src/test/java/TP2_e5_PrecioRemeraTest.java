import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp2_template_composite.tp2_e5.Importado;
import tp2_template_composite.tp2_e5.Nacional;
import tp2_template_composite.tp2_e5.Remera;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TP2_e5_PrecioRemeraTest {

    private Remera remeraImportada;
    private Remera remeraNacional;

    @BeforeEach
    public void setUp() {
        remeraImportada = new Importado();
        remeraNacional = new Nacional();
    }

    @Test
    public void testPrecioRemeraImportada() {

        double precioUnitario = 3500;
        double resultado = remeraImportada.calcularPrecioVenta(precioUnitario);

        assertEquals(4725.0, resultado, "El resultado no es el esperado.");
    }

    @Test
    public void testPrecioRemeraNacional() {

        double precioUnitario = 4750;
        double resultado = remeraNacional.calcularPrecioVenta(precioUnitario);

        assertEquals(4435.55, resultado, "El resultado calculado no es el esperado.");
    }
}
