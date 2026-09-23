package org.example.geometry3d;

import org.example.geometry2d.Figure;

public class Cylinder {

    Figure foundation;
    double height;


    public Cylinder(Figure f, double h) {
        this.foundation = f;
        this.height = h;
    }

    public double volume()  {
        return foundation.area() * height;
    }

    @Override
    public String toString() {
        return "Цилиндр с высотой " + height + " и основанием: " + foundation.toString();
    }
}
