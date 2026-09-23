package org.example.geometry2d;
import org.example.exceptions.InvalidRectangleParameterException;

public class Rectangle implements  Figure{
    double length ;
    double width ;

    public Rectangle(double w, double l) throws InvalidRectangleParameterException {
        if(w <= 0 || l <= 0) throw new InvalidRectangleParameterException("Неккоретные данные для прямоугольнка");
        this.length = l;
        this.width = w;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public String toString() {
        return "Это прямоуголльник с длиной " + length + " и шириной " + width;
    }
}
