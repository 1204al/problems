package problem2.task4;

public class Ring extends Figure {
    private double r1;
    private double r2;

    public Ring(double r1, double r2) {
        if(r1>r2){
            this.r1 = r1;
            this.r2 = r2;
        }else{
            this.r2 = r1;
            this.r1 = r2;
        }
        this.square=findSquare();

    }

    @Override
    protected double findSquare() {
        return Math.PI*(r1*r1-r2*r2);
    }
}
