package org.example.geometry2d;

import org.example.exceptions.InvalidRadiousException;

public class Circle implements Figure{

    double radios;

    public Circle(double r) throws InvalidRadiousException {
        if(r <= 0) throw new InvalidRadiousException("Некорректный радиус");
        this.radios = r;
    }

    @Override
    public double area() {
        return radios * radios * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radios;
    }

    @Override
    public String toString() {
        return "Это круг с радиусом " + radios;
    }
}
