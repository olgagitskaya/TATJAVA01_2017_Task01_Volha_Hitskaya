package com.company;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        int n = 6;
        if(n%2!=0)
        {
            System.out.println("n should be even");
            return;
        }
        int myArrayMatrix[][] = new int[n][];
        for (int m=0; m<n; m+=2)
        {
            myArrayMatrix[m]= new int[n];
            for (int i = 0; i < n; i++)
            {
                myArrayMatrix[m][i] = i + 1;
            }
            System.out.println(Arrays.toString(myArrayMatrix[m]) + " ");

            myArrayMatrix[m+1]= new int[n];
            for (int i = 0; i < n; i++)
            {
                myArrayMatrix[m+1][i] = n-i;
            }
            System.out.println(Arrays.toString(myArrayMatrix[m+1]) + " ");
        }
    }
}
