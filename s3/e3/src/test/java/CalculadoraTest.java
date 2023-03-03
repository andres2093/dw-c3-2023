import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import static org.junit.jupiter.api.Assertions.*;

@Suite
@SelectClasses({CalculadoraSumaTest.class, CalculadoraRestaTest.class, CalculadoraMultiplicaTest.class, CalculadoraDivideTest.class})
class CalculadoraTest {

}