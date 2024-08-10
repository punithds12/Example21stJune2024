package com.sgtest.inheritance;
class Fruits
{
    void fruitsName(String fruitname)
    {
        System.out.println("Fruit Name:"+fruitname);
    }
}
class Flower extends Fruits
{
  void flowerName(String flowrname)
  {
      System.out.println("Flower name:"+flowrname);
  }
}
class Vegetables extends Flower
{
    void vegetablName(String vegtalname)
    {
        System.out.println("vegetabl Name:"+vegtalname);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Vegetables o=new Vegetables();
        o.fruitsName("Apple");
        o.flowerName("Rose");
        o.vegetablName("carrot");
    }
}
