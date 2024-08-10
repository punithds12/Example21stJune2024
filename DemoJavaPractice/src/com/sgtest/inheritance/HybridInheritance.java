package com.sgtest.inheritance;
class Vehicle1
{
    void vehicle(String vehicleName )
    {
        System.out.println("Vehicle Name:"+vehicleName);
    }
}
class Vehicle2 extends Vehicle1
{
    void product(String productName)
    {
        System.out.println("product Name:"+productName);
    }
}
class Bird extends Vehicle1
{
    void nationalBird(String birdName)
    {
        System.out.println("National bird:"+birdName);
    }
}
class Animal extends Bird {
    void nationalAnimal(String animalName)
    {
        System.out.println("National Animal:"+animalName);
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Vehicle2 o1=new Vehicle2();
        o1.product("Hero Honda");
        o1.vehicle("Pulsar Rs200");
        Animal o2=new Animal();
        o2.nationalAnimal("tiger");
        o2.nationalBird("Peackock");
        o2.vehicle("Ducati");
    }
}
