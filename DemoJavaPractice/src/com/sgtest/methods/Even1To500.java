package com.sgtest.methods;
class Even
{
    void evenno()
    {
        int count=0;
        for (int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                count++;
            }

        }
        System.out.println(count);
    }
}

public class Even1To500 {
    public static void main(String[] args) {
        Even obj1=new Even();
        obj1.evenno();
    }
}
