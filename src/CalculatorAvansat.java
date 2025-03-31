public class CalculatorAvansat extends Calculator{

    public CalculatorAvansat(double x) {
        super(x);
    }

    public void RADICAL() {
        x = Math.sqrt(x);
    }

    public void EXPONENT(int a) {
        x = Math.pow(x, a);
    }
}
