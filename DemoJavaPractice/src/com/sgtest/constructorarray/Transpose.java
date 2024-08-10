package com.sgtest.constructorarray;
class Maths1{
    Maths1(int x[][])
    {
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                int res=x[j][i];
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
}
public class Transpose {
    public static void main(String[] args) {
        Maths1 obj1=new Maths1(new int[][]{{10,20,30},{40,50,60},{70,80,90}});

    }
}
