package com.company;

public class PerimetrSquare {
    public void getPerimetr(String str) throws PerimeterExeption {
        Square square = new Square();
        try {
            double side = Double.parseDouble(str);
            square.setSide(0);
        }catch (NumberFormatException e){
            throw new PerimeterExeption("String is incorrect");
        } catch (PerimeterExeption exeption) {
            System.err.println(exeption.getMessage());
        }
    }
}
