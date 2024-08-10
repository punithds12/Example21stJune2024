package com.sgtest.constructor;
class Shop
{
    String shopName;
    String shopAdress;
    String ownerName;
    long phNo;
    Shop(String ShopName,String ShopAdress,String OwnerName,long PhNo)
    {
        shopName=ShopName;
        shopAdress=ShopAdress;
        ownerName=OwnerName;
        phNo=PhNo;
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
    Purchase(String ItemName,int ItemCost,int PurchaseId )
    {
        itemName=ItemName;
        itemCost=ItemCost;
        purchaseId=PurchaseId;
        System.out.println("Item Name:"+itemName);
        System.out.println("Item Cost:"+itemCost);
        System.out.println("Purchase Id:"+purchaseId);
    }
}
class Distributor
{
    String distributorName
            ;
    String adress;
    long phNO;
    Distributor(String DistributorName,String Adress,long Phno)
    {
        distributorName=DistributorName;
        adress=Adress;
        phNO=Phno;
        System.out.println("Distributor Name;"+distributorName);
        System.out.println("Adress:"+adress);
        System.out.println("Phone NO:"+phNO);
    }
}
public class ParamaetrizedConstructor2 {
    public static void main(String[] args) {
    Shop obj1=new Shop("GAnesha Enterprizes","Bangalore","Punith DS",8660389253L);
    Purchase obj2=new Purchase("Maggi",30,01);
    Distributor obj3=new Distributor("NESTLE","Mumbai",123456789L);
}
}