package problem2.task4;

import java.util.Arrays;

public class Shape{
    private double square=0;
    public double addArea(Figure... others){
        this.square+=Arrays.stream(others).mapToDouble(Figure::getSquare).sum();
        return this.square;
    }

    public double getSquare() {
        return square;
    }
}
