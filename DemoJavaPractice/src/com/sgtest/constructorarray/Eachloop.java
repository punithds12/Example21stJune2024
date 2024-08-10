package com.sgtest.constructorarray;
class Maths7
{
    Maths7(int a[][])
    {
        int count=0;
        for(int b[]:a)
        {
            for(int s:b)
            {
                count=count+1;
            }
        }
        System.out.println(count+" ");
    }
}
public class Eachloop {
    public static void main(String[] args)
    {
        int d[][]={{6,5,4,},{7,8,9},{3,5,6}};
        Maths7 p=new Maths7(d);
    }
}
