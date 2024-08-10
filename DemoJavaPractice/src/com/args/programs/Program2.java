package com.args.programs;

import javax.swing.*;

class Animal{
    String name;
    int Lifespan;
    String scientificname;
    Animal()
    {
        name="Lion";
        Lifespan=15;
        scientificname="pantherus leo";
        System.out.println(name);
        System.out.println(Lifespan);
    }

}
class Acquatic_animal{
    String name;
    int lifespan;
    String scientificname;
    Acquatic_animal()
    {
        name="sealion";
        lifespan=30;
        scientificname="Eumetopias jubatus";
        System.out.println(name);
        System.out.println(lifespan);
        System.out.println(scientificname);
    }
}
public class Program2 {
    public static void main(String args[]){
        Animal obj1=new Animal();
        Acquatic_animal obj2=new Acquatic_animal();
    }
}
