package forgeTest;

import forge.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(5, 2);
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
}