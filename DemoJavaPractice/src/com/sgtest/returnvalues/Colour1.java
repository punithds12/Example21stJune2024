package com.sgtest.returnvalues;
class Colour
{
    String colourName(String name)
    {
        return name;
    }
}
public class Colour1 {
    public static void main(String[] args) {
        Colour obj1=new Colour();
        String name=obj1.colourName("RED yellow blue");
        System.out.println(name);

    }
}
