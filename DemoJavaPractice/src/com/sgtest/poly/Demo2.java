package com.sgtest.poly;
abstract class Sounds
{
    abstract void Animalsound();

}
class dog extends Sounds
{
    void Animalsound()
    {
        System.out.println("dog:barking");
    }

}
class lion extends Sounds
{
    void Animalsound()
    {
        System.out.println("lion:roars");
    }
}
class birds extends Sounds
{
    void Animalsound()
    {
        System.out.println("birds:chirps");
    }
}
class bees extends Sounds
{
    void Animalsound()
    {
        System.out.println("bees:buzzes");
    }
}


public class Demo2 {

    public static void main(String[] args) {

        Sounds s=null;
        dog o1=new dog();
        lion o2=new lion();
        birds o3=new birds();
        bees o4=new bees();


        s=o1;
        s.Animalsound();

        s=o2;
        s.Animalsound();

        s=o3;
        s.Animalsound();

        s=o4;
        s.Animalsound();


    }
}
