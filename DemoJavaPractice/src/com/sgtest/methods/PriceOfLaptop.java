package com.sgtest.methods;
class DisplayName
{  
    String lapName(String name)
    {
        return name;
    }
}

public class PriceOfLaptop {
    public static void main(String[] args) {
        DisplayName o=new DisplayName();
        String lapName= o.lapName("HP Laptop");
        System.out.println(lapName);
    }
}
