package com.company;

public class Main {

    public static void main(String[] args) {
	double a = -1;
	double b = 2;
	double c = -3;

	if(a==0 || c==0)
    {
        System.out.println("It is not allowed to divide by zero!");
        return;
    }

    if((a<0||c<0) && (a>0||c>0))
    {
        System.out.println("It is not allowed to take the square root of a negative number!");
        return;
    }

    double result = (b+Math.sqrt(Math.pow(b,2)+(4*a*c)))/(2*a) - ((Math.pow(a,3)*c)+Math.pow(b,-2));
	System.out.println(result);
    }
}

