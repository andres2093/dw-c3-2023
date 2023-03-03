import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MathApplicationTest {

    @Mock
    CalculadoraService calculadoraService;

    @InjectMocks
    MathApplication mathApplication;

    @Test
    void add() {
        when(calculadoraService.add(10, 20)).thenReturn(30.0);

        assertEquals(mathApplication.add(10, 20), 30, 0);

        verify(calculadoraService).add(10.0, 20.0);
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}