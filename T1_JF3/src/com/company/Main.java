package com.company;

public class Main {

    public static void main(String[] args) {
        double AB = 2;
        double AC = 6;

        if(AB==0||AC==0)
        {
            System.out.println("The geometric figure is not a triangle!");
            return;
        }

        if(AB<0||AC<0)
        {
            System.out.println("Triangle sides cannot have negative values!");
            return;
        }


        //to find the third side of the triangle we use the Pythagorean Theorem
        double BC = Math.sqrt(AB * AB + AC * AC);

        double P = AB + AC + BC;
        System.out.println("Perimeter of a triangle is " + P);

        double S = (AB * AC) / 2;
        System.out.println("Square of a triangle is " + S);

    }
}
