package com.args.programs;
class Restaurant {
    String Restaurant_name;
    String Restaurant_Location;
    String Restaurant_area;
    String Restuarant_type;
    Restaurant()

    {
        Restaurant_name = "MTR";
        Restaurant_Location = "Bengaluru";
        Restaurant_area = "Kslayout";
        Restuarant_type = "Veg";
        System.out.println(Restaurant_name);
        System.out.println(Restaurant_Location);
        System.out.println(Restaurant_area);
        System.out.println(Restuarant_type);
    }
}
class Food_delivery{
    String Appname;
    String Hotelname;
    String deliveryperson;
    long contno;
    Food_delivery()
    {
        Appname="Zomato";
        Hotelname="udupi";
        deliveryperson="punith";
        contno=8039324783L;
        System.out.println(Appname);
        System.out.println(Hotelname);
        System.out.println(deliveryperson);
        System.out.println(contno);
    }
}
public class Program {
    public static void main(String[] args)
    {
        Restaurant obj1=new Restaurant();
        Food_delivery obj2=new Food_delivery();
    }
}
