package com.sgtest.thisoperator;
class WholeSeller
{
    String sellerName;
    String adress;
    long phNo;
    WholeSeller(String sellerName,String  adress,long phNO)
    {
        this.sellerName=sellerName;
        this.adress=adress;
        this.phNo=phNO;
        System.out.println("Seller NAme:"+sellerName);
        System.out.println("Adress:"+adress);
        System.out.println("Phone NO:"+phNO);
    }
}
class  Purchaser
{
    String itemName;
    int itemCost;
    int purchaserId;
    Purchaser(String itemName,int itemCost,int purchaseId )
    {
        this.itemName=itemName;
        this.itemCost=itemCost;
        this.purchaserId=purchaseId;
        System.out.println("Item Name:"+itemName);
        System.out.println("Item Cost:"+itemCost);
        System.out.println("Purchase Id:"+purchaseId);
    }
}
class Retailer
{
    String retailerName;
    String stock;
    int id;
    Retailer(String retailerName,String stock,int id)
    {
        this.retailerName=retailerName;
        this.stock=stock;
        this.id=id;
        System.out.println("Retailer Name:"+retailerName);
        System.out.println("Stock:"+stock);
        System.out.println("ID:"+id);
    }
}

public class ThisOperator3 {
    public static void main(String[] args) {
        WholeSeller obj1=new WholeSeller("Kiran","Hindupur",986565656L);
        Purchaser obj2=new Purchaser("Rice",35,01);
        Retailer obj3=new Retailer("Ravi","yes",02);
    }
}

