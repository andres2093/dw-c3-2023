import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraMultiplicaTest {

    static Calculadora calculadora;

    @BeforeAll
    static void setup(){
        calculadora = new Calculadora();
    }

    @Test
    void multiplica() {
        int esperado = 6;
        assertEquals(esperado, calculadora.multiplica(3, 2));
    }
}