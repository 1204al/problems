package problem2.task4;

public class Parallelogram extends Figure {
    private double a;
    private double b;
    private double hA;

    public Parallelogram(double a, double b, double hA) {
        this.a = a;
        this.b = b;
        this.hA = hA;
        this.square=findSquare();
    }

    @Override
    protected double findSquare() {
        return a*hA;
    }
}
