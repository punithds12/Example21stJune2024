package com.sgtest.constructorarray;
class Maths6
{
    Maths6(int a[][])
    {
        String str=" ";
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if((j==1)||(j==2))
                {
                    str=str+a[i][j]+" ";
                }
            }
        }
        System.out.println(str+" ");
    }
}
public class Elementsalone {
    public static void main(String args[])
    {
        int k[][]={{2,3,4},{5,6,7,},{7,8,9}};
        Maths6 p=new Maths6(k);
    }
}
