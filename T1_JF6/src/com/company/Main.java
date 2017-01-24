package com.company;

public class Main {

    public static void main(String[] args) {
	double a = 0;
	double b = 2;
	double c = -3;
	double sum = 0;

	if(a>b && a>c && b>c || c>a && c>b && b>a)
    {
        sum = a+c;
    }
    else if(b>a && b>c && c>a || a>b && a>c && c>b )
    {
        sum = b+a;
    }
    else if(c>a && c>b && a>b || b>a && b>c && a>c )
    {
        sum = b+c;
    }

        System.out.println(sum);

    }
}
