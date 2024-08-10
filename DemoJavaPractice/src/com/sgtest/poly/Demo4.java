package com.sgtest.poly;
abstract class PersonFunction
{
    abstract void function();
}
class Boss extends PersonFunction
{
    void function()
    {
        System.out.println(" person function as Boss");
    }
}
class Manager extends PersonFunction
{
    void function()
    {
        System.out.println("person function as manager");
    }
}
class Supervisor extends PersonFunction
{
    void function()
    {
        System.out.println("person function as Supervisor");
    }
}
public class Demo4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PersonFunction PF=null;
        Boss o1=new Boss();
        Manager o2=new Manager();
        Supervisor o3=new Supervisor();
        PF=o1;
        PF.function();
        PF=o2;
        PF.function();
        PF=o3;
        PF.function();
    }

}

