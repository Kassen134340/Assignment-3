package com.company;

public class Shape {
    String colour;
    public boolean filled;

    public Shape() {
        this.colour = "green";
        this.filled = true;
    }

    public Shape(String colour, boolean filled) {
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }



    public String toString() {
        if (!isFilled()) return "not filled";

        return " A Shape" +
                " with colour of" + colour +
                " filled" + filled ;
    }
}

