package com.company;

public class Main {

    public static void main(String[] args) {
    double [] myArray = {2,-5,0};
    double myArrayElementPow = 0;

    for(int i =0; i<=2; i++)
    {
        if(myArray[i]<0)
        {
            myArrayElementPow = Math.pow(myArray[i],4);
        }
        else
        {
            myArrayElementPow = Math.pow(myArray[i],2);
        }
        System.out.println(myArrayElementPow);
    }
    }
}
