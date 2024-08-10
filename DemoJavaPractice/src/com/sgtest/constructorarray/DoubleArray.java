package com.sgtest.constructorarray;
class Maths5
{
    Maths5(double x[][])
    {
        int sum=0;
        for(int i=x.length-1;i>=0;i--)
        {
            for(int j=x[i].length-1;j>=0;j--)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }

    }
}
public class DoubleArray {
    public static void main(String[] args) {
        Maths5 obj1=new Maths5(new double[][]{{1.1,2.7,3},{2,5.4,7},{5.7,6.5,7}});
    }
}


