package com.company;
public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws PerimeterExeption {
        if (side<=0){
            throw new PerimeterExeption("Side is incorrect");
        }
        this.side = side;
    }

}
