package problem2.task4;

public class Main {
    public static void main(String[] args) {
        Figure t=new Triangle(2,3,3);
        Figure p=new Parallelogram(3,4,3);
        Figure tm=new Trapezium(6,4,3);
        Figure r=new Ring(4,5);
        Shape shape=new Shape();
        shape.addArea(p,t,tm,r);
        System.out.println(shape.getSquare());


    }
}
