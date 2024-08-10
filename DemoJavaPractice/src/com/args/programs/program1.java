package com.args.programs;
class Nationalpark{
    String Nationalpark_name;
    String location;
    int Establish_year;
    Nationalpark()

    {
        Nationalpark_name = "Bannerghatta";
        location = "Bengaluru";
        Establish_year = 1989;
        System.out.println(Nationalpark_name);
        System.out.println(location);
        System.out.println(Establish_year);
    }
}
class Wonderla{
    String name;
    String location;
    int Establish_year;
    Wonderla()
    {
        name="Wonderla amusinment";
        location="bengaluru";
        Establish_year=2014;
        System.out.println(name);
        System.out.println(location);
        System.out.println(Establish_year);
    }
}
public class program1 {
    public static void main(String[] args)
    {
        Nationalpark obj1=new Nationalpark();
        Wonderla obj2=new Wonderla();
    }
}
