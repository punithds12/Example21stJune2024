package com.sgtest.returnvalues;
class Odd
{
    int[] Display()
    {
        int s[]={9,7,5,3,1};
        return s;
    }
}
public class OddNumber {
    public static void main(String[] args) {
        Odd obj1=new Odd();
        int s[]= obj1.Display();
        for(int val:s)
        System.out.println(val);
    }
}
