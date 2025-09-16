package src.test.java;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class ConversorTemperaturaTest {

    @Test
    void testCelsiusParaFahrenheit() {
        assertEquals(32, ConversorTemperatura.celsiusParaFahrenheit(0), 0.01);
        assertEquals(212, ConversorTemperatura.celsiusParaFahrenheit(100), 0.01);
        assertEquals(-459.67, ConversorTemperatura.celsiusParaFahrenheit(-273.15), 0.01);
    }

    @Test
    void testFahrenheitParaCelsius() {
        assertEquals(0, ConversorTemperatura.fahrenheitParaCelsius(32), 0.01);
        assertEquals(100, ConversorTemperatura.fahrenheitParaCelsius(212), 0.01);
        assertEquals(-273.15, ConversorTemperatura.fahrenheitParaCelsius(-459.67), 0.01);
    }
}
