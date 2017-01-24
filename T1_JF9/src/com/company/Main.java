package com.company;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        int[] myArray1 = {2, 8, 9, 4};
        int[] myArray2 = {3, 7, -1, 0, 5};
        int[] myArray12 = new int[myArray1.length + myArray2.length];
        int k = 3;
        int i;

        for (i = 0; i < k; i++)
        {
            myArray12[i] = myArray1[i];
        }

        for (int j = 0; j < myArray2.length; j++)
        {
            myArray12[k] = myArray2[j];
            k++;
        }

        for (int h = i; h < myArray1.length; h++)
        {
            myArray12[k] = myArray1[h];
            k++;
        }

        System.out.println(Arrays.toString(myArray12));
    }
}
