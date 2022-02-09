package com.company;

public class TestShape {

    public static void main(String[] args) {

            Shape s1=new Shape("green",false);
            System.out.println(s1.getColour());
            System.out.println(s1.isFilled());


            Circle s2 = new Circle(5.5, "red", true);
            System.out.println(s2.getArea());
            System.out.println(s2.getPerimeter());
            System.out.println(s2.getColour());
            System.out.println(s2.isFilled());
            System.out.println(s2.getRadius());



            Rectangle s3 = new Rectangle(3.0, 4.0, "green", true);
            System.out.println(s3);
            System.out.println(s3.getArea());
            System.out.println(s3.getPerimeter());
            System.out.println(s3.getColour());
            System.out.println(s3.getLength());


            Square s4 = new Square(2.0);
            System.out.println(s4);
            System.out.println(s4.getArea());
            System.out.println(s4.getColour());
            System.out.println(s4.getSide());
        }
    }

