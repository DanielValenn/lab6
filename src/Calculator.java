public class Calculator {
    protected double x;

    public Calculator(double x) {
        this.x = x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public Calculator ADUNARE(double a) {
        x += a;
        return this;

    }

    public Calculator SCADERE(double a) {
        x -= a;
        return this;
    }

    public void INMULTIRE(double a) {
        x *= a;
    }

    public void IMPARTIRE(double a) {
        if (a == 0){
            throw new RuntimeException("Nu poti sa imparti cu zero!");
        }
        x /= a;
    }

    public void getREZULTAT() {
        System.out.println(x);
    }

    public void RADICAL() {
        x = Math.sqrt(x);
    }

    public void EXPONENT(int a) {
        x = Math.pow(x, a);
    }

}
