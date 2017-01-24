package com.company;

public class Main {

    public static void main(String[] args) {
	//int N = 4;
        int [] A = {1,8,9,18};

        int K = 9;
        int sum =0;

        for(int i = 0; i<A.length; i++)
        {
            if(A[i]%K == 0)
            {
                sum+=A[i];
            }
        }
        System.out.println(sum);

    }
}
