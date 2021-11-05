package com.company;

public class Main {

    public static void main(String[] args) {
PerimetrSquare perimetrSquare = new PerimetrSquare();
        try {
            perimetrSquare.getPerimetr("g");
        } catch (PerimeterExeption e) {
            e.printStackTrace();
        }
    }
}
