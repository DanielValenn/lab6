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

    public void ADUNARE(double a) {
        x += a;
    }

    public void SCADERE(double a) {
        x -= a;
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

}
