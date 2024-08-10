package com.args.programs;
class Fruits{
    String fruitName;
    String fruitColour;
    String fruitSize;
    int noOffruits;
    Fruits()
    {
        fruitName="Pine apple";
        fruitColour="yellow";
        fruitSize="medium";
        noOffruits=1;
        System.out.println(fruitName);
        System.out.println(fruitColour);
        System.out.println(fruitSize);
        System.out.println(noOffruits);

    }

}
class Flowers{
    String flowerName;
    String flowerColour;
    String flowerSize;
    int noOfflowers;
    {
        flowerName="rose";
        flowerColour="red";
        flowerSize="small";
        noOfflowers=12;
        System.out.println(flowerName);
        System.out.println(flowerColour);
        System.out.println(flowerSize);
        System.out.println(noOfflowers);

    }
}
class Vegetables{
    String vegetableName;
    String vegetableColour;
    String vegetableSize;
    String vegetableWeight;
    {
        vegetableName="Carrot";
        vegetableColour="orange";
        vegetableSize="big";
        vegetableWeight="1kg";
        System.out.println(vegetableName);
        System.out.println(vegetableSize);
        System.out.println(vegetableColour);
        System.out.println(vegetableWeight);

    }
}

public class FruitsArgs {
    public static void main(String[] args) {
        Fruits obj1=new Fruits();
        Flowers obj2=new Flowers();
        Vegetables obj3=new Vegetables();

    }
}
