package problem2.task4;

public class Trapezium extends Figure {
    private double a;
    private double b;
    private double h;

    public Trapezium(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.square=findSquare();
    }

    @Override
    protected double findSquare() {
        return (a+b)/2*h;
    }
}
