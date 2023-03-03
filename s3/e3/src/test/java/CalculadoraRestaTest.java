import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraRestaTest {

    static Calculadora calculadora;

    @BeforeAll
    static void setup(){
        calculadora = new Calculadora();
    }

    @Test
    void resta() {
        int esperado = 1;
        assertEquals(esperado, calculadora.resta(3, 2));
    }
}