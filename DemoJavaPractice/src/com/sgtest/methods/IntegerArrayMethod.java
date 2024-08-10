package com.sgtest.methods;
class Method2{
    void Array1(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            if ((i==0)||(i==(a.length-1)))
            {
                System.out.println(a[i]);
            }
        }
    }
}

public class IntegerArrayMethod {
    public static void main(String[] args) {
        Method2 obj1=new Method2();
        obj1.Array1(new int[]{1,2,3,5,6,7,8});
        obj1.Array1(new int[]{10,20,30,40,50});
    }
}
