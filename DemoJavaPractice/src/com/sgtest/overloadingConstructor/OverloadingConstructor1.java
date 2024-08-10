package com.sgtest.overloadingConstructor;
class Product
{
    Product(String productName)
    {
        System.out.println("Product Name:"+productName);
    }
    Product(int productNo)
    {
        System.out.println("Product NO:"+productNo);
    }
    Product(long productWeight)
    {
        System.out.println("Product Weight:"+productWeight);
    }
}

public class OverloadingConstructor1 {
    public static void main(String[] args) {
        Product obj1=new Product("wheat");
        Product obj2=new Product(22);
        Product obj3=new Product(30L);
    }
}
