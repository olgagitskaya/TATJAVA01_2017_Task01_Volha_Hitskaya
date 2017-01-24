package com.company;

public class Main {

    public static void main(String[] args) {
    double a = 6;
    double b = 20;
    double h = 1;
    double F = 0;

    if(a<=b && h>=0)
    {
        for (double x = a; x <= b;)
        {
            F = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
            System.out.print(x);
            System.out.print(" | ");
            System.out.println(F);
            //System.out.println("_________________________");
            x+=h;

        }

    }
    else
    {
        System.out.println("Wrong interval [a,b] selected or wrong step 'h' value!");
    }


    }
}
