package com.sgtest.thisoperator;class Shop
{
    String shopName;
    String shopAdress;
    String ownerName;
    long phNo;
    Shop(String shopName,String shopAdress,String ownerName,long phNo)
    {
        this.shopName=shopName;
        this.shopAdress=shopAdress;
        this.ownerName=ownerName;
        this.phNo=phNo;
        System.out.println("Shop Name:"+shopName);
        System.out.println("Shop adress:"+shopAdress);
        System.out.println("Owner Name:"+ownerName);
        System.out.println("Phone Number:"+phNo);
    }
}
class  Purchase
{
    String itemName;
    int itemCost;
    int purchaseId;
    Purchase(String itemName,int itemCost,int purchaseId )
    {
        this.itemName=itemName;
        this.itemCost=itemCost;
        this.purchaseId=purchaseId;
        System.out.println("Item Name:"+itemName);
        System.out.println("Item Cost:"+itemCost);
        System.out.println("Purchase Id:"+purchaseId);
    }
}
class Distributor
{
    String distributorName;
    String adress;
    long phNo;
    Distributor(String distributorName,String adress,long phNo)
    {
        this.distributorName=distributorName;
        this.adress=adress;
        this.phNo=phNo;
        System.out.println("Distributor Name;"+distributorName);
        System.out.println("Adress:"+adress);
        System.out.println("Phone NO:"+phNo);
    }
}
public class ThisOperator2{
    public static void main(String[] args) {
        Shop obj1=new Shop("Manjunatha Enterprizes","Bangalore","Punith DS",8660389253L);
        Purchase obj2=new Purchase("wheat",40,01);
        Distributor obj3=new Distributor("Godrej","Chennai",123456789L);
    }
}



