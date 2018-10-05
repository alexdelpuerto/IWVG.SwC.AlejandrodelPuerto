package forge;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction multiply(Fraction fraction) {
        this.numerator = this.numerator * fraction.getNumerator();
        this.denominator = this.denominator * fraction.getDenominator();
        return this;
    }
    public boolean isPropia() {
        if (this.numerator<this.denominator){
            return true;
        }
        return false;
    }

    public Fraction divide(Fraction fraction) {
        this.numerator = this.numerator * fraction.getDenominator();
        this.denominator = this.denominator * fraction.getNumerator();
        return this;
    }

}
