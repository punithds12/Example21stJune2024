package com.sgtest.constructorarray;
class Array1 {
    Array1(int x[][]) {
        int row = x.length;
        int col = x[0].length;
        int[] D = new int[row * col];
        int k = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                D[k] = x[i][j];
                k++;
            }
        }
        for (int i = 0; i < D.length; i++) {
            System.out.println(D[i] + " ");
        }
    }
}

public class Convert2DTo1D {
    public static void main(String[] args)
    {
        int s1[][] ={{4,5,6},{7,8,9},{12,13,14}};
        Array1 p=new Array1(s1);
    }
}
