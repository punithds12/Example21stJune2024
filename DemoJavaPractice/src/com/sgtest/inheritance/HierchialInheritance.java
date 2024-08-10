package com.sgtest.inheritance;
class Maths1
{
    void addition(int x,int y)
    {
        System.out.println("addition result:"+(x+y));
    }
}
class Maths2 extends Maths1
{
    void substraction(int a,int b)
    {
        System.out.println("substraction result:"+(a-b));
    }
}
class Maths3 extends Maths1
{
    void division (int x,int y)
    {
        System.out.println("Division Result:"+x/y);
    }
}
public class HierchialInheritance {
    public static void main(String[] args) {
        Maths2 obj1=new Maths2();
        obj1.substraction(20,10);
        obj1.addition(20,20);
        Maths3 obj2=new Maths3();
        obj2.division(20,2);
        obj2.addition(20,13);
    }
}
