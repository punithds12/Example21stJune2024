package com.sgtest.methods;
class Method1
{
    void fact(int x)
    {
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }

}

public class SampleMethod {
    public static void main(String[] args) {
        Method1 obj=new Method1();
        obj.fact(5);

    }
}
