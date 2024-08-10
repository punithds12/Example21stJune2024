package com.sgtest.overloadingConstructor;
class Insurance
{
    Insurance(String insuranceName)
    {
        System.out.println("Insurance Name:"+insuranceName);
    }
    Insurance(int insurerAge)
    {
        System.out.println("Insurer Age:"+insurerAge);
    }
    Insurance(long insurerContactNo)
    {
        System.out.println("contact NO:"+insurerContactNo);
    }
}

public class OverLoadingCunstructor5 {
    public static void main(String[] args)
    {
        Insurance obj1=new Insurance("Life Insurance");
        Insurance obj2=new Insurance(55);
        Insurance obj3=new Insurance(123456789L);
    }
}


