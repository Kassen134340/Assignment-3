package com.company;


public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
        side = 1.0;
    }

    public Square(double side) {
        super(side, side);
    }
    public Square(double side,String colour,boolean filled){
        super(colour,filled);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "A Square with side" + side + "which is a subclass of" + super.toString();
    }

}