package com.sgtest.overloadingConstructor;
class Buyer
{
    Buyer(String buyerName)
    {
        System.out.println("Buyer Name:"+buyerName);
    }
    Buyer(int buyerAge)
    {
        System.out.println("buyerAge:"+buyerAge);
    }
    Buyer(long buyerContactNo)
    {
        System.out.println("contact NO:"+buyerContactNo);
    }
}

public class OverLoadingCunstructor3 {
    public static void main(String[] args)
    {
        Buyer obj1=new Buyer("John");
        Buyer obj2=new Buyer(55);
        Buyer obj3=new Buyer(9660389253L);
    }
}

