package com.sgtest.returnvalues;
class Matrix
{
    int[][] Display(int m[][],int n[][])
    {
        int b[][]=new int[m.length][m[0].length];
        //int x=0,y=0;
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                b[i][j]=m[i][j]+n[i][j];
            }
        }
        return b;
    }
}
public class AdditionOfTwoMatrix {
    public static void main(String[] args) {
        Matrix m=new Matrix();
        int x[][]={{1,2,3},{6,7,8},{10,11,12}};
        int y[][]={{2,4,6},{8,10,12},{7,8,9}};
        int z[][]=m.Display(x,y);
        for(int[]val:z)
        {
            for(int w:val)
            {
                System.out.print(w+" ");
            }
            System.out.println();
        }
    }
}
