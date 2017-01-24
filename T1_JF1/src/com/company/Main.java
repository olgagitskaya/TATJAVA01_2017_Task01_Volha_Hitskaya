package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 2929;
        int myArray[]= new int [4];

        for(int i=3; i>=0; i--)
        {
            myArray[i]= number%10;
            number/=10;
        }

        int sum12 = myArray[0]+myArray[1];
        int sum34 = myArray[2]+myArray[3];

        System.out.println(sum12==sum34);
    }
}
