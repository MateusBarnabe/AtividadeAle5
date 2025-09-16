package src.test.java;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraIMCTest {

    private CalculadoraIMC imcCalc;

    @BeforeEach
    void setUp() {
        imcCalc = new CalculadoraIMC();
    }

    @Test
    void testCalcularEClassificar() {
        assertEquals("Abaixo do peso", imcCalc.classificar(imcCalc.calcular(50, 1.7)));
        assertEquals("Normal", imcCalc.classificar(imcCalc.calcular(65, 1.7)));
        assertEquals("Sobrepeso", imcCalc.classificar(imcCalc.calcular(75, 1.7)));
        assertEquals("Obesidade", imcCalc.classificar(imcCalc.calcular(95, 1.7)));
    }

    @Test
    void testAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> imcCalc.calcular(70, 0));
    }

    @AfterEach
    void tearDown() {
        imcCalc = null;
    }
}
