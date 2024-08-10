package com.sgtest.overloadingConstructor;

class Supplier1
{
    Supplier1(String supplierName)
    {
        System.out.println("Supplier Name:"+supplierName);
    }
    Supplier1(int supplierAge)
    {
        System.out.println("Supplier Age:"+supplierAge);
    }
    Supplier1(long suppierContactNo)
    {
        System.out.println("contact NO:"+suppierContactNo);
    }
}

public class OverLoadingCunstructor4 {
    public static void main(String[] args)
    {
        Supplier1 obj1=new Supplier1("simha");
        Supplier1 obj2=new Supplier1(22);
        Supplier1 obj3=new Supplier1(9960389253L);
    }
}

