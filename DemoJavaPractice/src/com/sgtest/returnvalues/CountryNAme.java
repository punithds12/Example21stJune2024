package com.sgtest.returnvalues;
class Country
{
    String Display(String name)
    {
        return name;
    }
}
public class CountryNAme {
    public static void main(String[] args) {
        Country obj1=new Country();
        String s= obj1.Display("India");
        System.out.println(s);
    }
}
