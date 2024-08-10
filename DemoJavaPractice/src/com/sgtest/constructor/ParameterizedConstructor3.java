package com.sgtest.constructor;
class WholeSeller
{
    String sellerName;
    String adress;
    long phNo;
    WholeSeller(String SellerName,String  Adress,long PhNO)
    {
        sellerName=SellerName;
        adress=Adress;
        phNo=PhNO;
        System.out.println("Seller NAme:"+sellerName);
        System.out.println("Adress:"+adress);
        System.out.println("Phone NO:"+phNo);
    }
}
class  Purchaser
{
    String itemName;
    int itemCost;
    int purchaserId;
    Purchaser(String ItemName,int ItemCost,int PurchaseId )
    {
        itemName=ItemName;
        itemCost=ItemCost;
        purchaserId=PurchaseId;
        System.out.println("Item Name:"+itemName);
        System.out.println("Item Cost:"+itemCost);
        System.out.println("Purchase Id:"+purchaserId);
    }
}
class Retailer
{
    String retailerName;
    String stock;
    int id;
    Retailer(String RetailerName,String Stock,int ID)
    {
        retailerName=RetailerName;
        stock=Stock;
        id=ID;
        System.out.println("Retailer Name:"+retailerName);
        System.out.println("Stock:"+stock);
        System.out.println("ID:"+id);
    }
}

public class ParameterizedConstructor3 {
    public static void main(String[] args) {
        WholeSeller obj1=new WholeSeller("Kiran","Hindupur",986565656L);
        Purchaser obj2=new Purchaser("Rice",35,01);
        Retailer obj3=new Retailer("Ravi","yes",02);
    }
}
