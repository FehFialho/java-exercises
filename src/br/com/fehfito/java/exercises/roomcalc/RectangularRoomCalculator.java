package br.com.fehfito.java.exercises.roomcalc;

public class RectangularRoomCalculator implements GeometricCalculator {

    @Override
    public double calcArea(double height, double width) {
        return height * width;
    }

    @Override
    public double calcPerimeter(double height, double width) {
        return (height * 2) + (width * 2);
    }
}