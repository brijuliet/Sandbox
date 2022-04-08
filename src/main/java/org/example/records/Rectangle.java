package org.example.records;

public record Rectangle(double width, double length) {
    // record class has pre-coded to string, .hashcode, .equals, .length, .width)

    public double area() {
        return width * length;
    }
}
