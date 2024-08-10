package com.sgtest.constructorarray;
class Maths{
    Maths (int x[][],int y[][])
    {
        for(int i=0;i<x.length;i++)
        {
            for (int j=0;j<x[i].length;j++)
            {
                int res=x[i][j] - y[i][j];
                System.out.print(res+" ");
            }
        }
    }
}

public class Substraction {
    public static void main(String[] args) {
        Maths obj1=new Maths(new int [][]{{1,2},{4,5}},new int[][]{{100,200},{300,400}});
    }
}
