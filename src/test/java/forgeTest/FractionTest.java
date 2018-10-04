package forgeTest;

import forge.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {

    private Fraction fraction;
    private Fraction fraction2;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(5, 2);
        this.fraction2 = new Fraction(2, 5);
    }

    @Test
    void testDecimal() {
        assertEquals(2.5, this.fraction.decimal(), 10e-5);
    }

    @Test
    void testgetNumerator() {
        assertEquals(5, this.fraction.getNumerator());
    }

    @Test
    void testgetDenominator() {
        assertEquals(2, this.fraction.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(4,7);
        assertEquals(20, this.fraction.multiply(fraction1).getNumerator());
        assertEquals(14, this.fraction.getDenominator());
    }
    @Test
    void testisPropia() {
        assertEquals(true, fraction2.isPropia());
    }

}