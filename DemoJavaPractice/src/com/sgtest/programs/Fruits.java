package com.sgtest.programs;

import javax.swing.*;

class Fruit
{
    String fruitsName;
    String fruitColour;
    String fruitSize;
    int noOffruits;
}
class Flowers
{
    String flowerName;
    String flowerColour;
    String flowerSize;
    int noOfflowers;
}
class Vegetables
{
    String vegetableName;
    String vegetableColour;
    String vegetableSize;
    String vegetableWeight;
}
public class Fruits {
    public static void main(String[] args) {
        Fruit obj1 = new Fruit();
        obj1.fruitsName = "apple";
        obj1.fruitColour = "Red";
        obj1.fruitSize = "medium";
        obj1.noOffruits = 2;
        System.out.println(obj1.fruitsName);
        System.out.println(obj1.fruitColour);
        System.out.println(obj1.fruitSize);
        System.out.println(obj1.noOffruits);

        Flowers obj2 = new Flowers();
        obj2.flowerName = "jasmine";
        obj2.flowerColour = "white";
        obj2.flowerSize = "small";
        obj2.noOfflowers = 10;
        System.out.println(obj2.flowerName);
        System.out.println(obj2.flowerColour);
        System.out.println(obj2.flowerSize);
        System.out.println(obj2.noOfflowers);

        Vegetables obj3 = new Vegetables();
        obj3.vegetableName = "potato";
        obj3.vegetableColour = "brown";
        obj3.vegetableSize = "medium";
        obj3.vegetableWeight = "1kg";
        System.out.println(obj3.vegetableName);
        System.out.println(obj3.vegetableColour);
        System.out.println(obj3.vegetableSize);
        System.out.println(obj3.vegetableWeight);
    }
    }

