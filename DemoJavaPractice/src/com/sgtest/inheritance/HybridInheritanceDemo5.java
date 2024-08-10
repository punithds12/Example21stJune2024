/*package com.sgtest.inheritance;
class Customer2
{
    String customerName;
    Customer2(String customerNAme)
    {
        customerName=customerNAme;
        System.out.println("Customer Name;"+customerName);
    }
}
class Customer3 extends Customer2
{
    String customerfriendName;
    Customer3(String customerNAme,String customerfriendNAme)
    {
        super(customerNAme);
        this.customerfriendName=customerfriendNAme;
        System.out.println("Customer Name:"+customerfriendName);
    }
}
class Customer4 extends Customer2
{
  String customerWifeName;
  Customer4(String customerName,String customerWifeName)
    {
        super(customerName);
        this.customerWifeName=customerWifeName;
        System.out.println("Customer Wife Name:"+customerWifeName);
    }
}
class Product1 extends Customer4
{
    String getproductNAme;
    int getProductCost;
    Product1(String customerName,String customerWifeName,String productName,int productCost)
    {
        super(customerName,customerWifeName);
        getproductNAme=productName;
        getProductCost=productCost;
        System.out.println("product name:"+getproductNAme);
        System.out.println("product cost:"+getProductCost);

    }
}

public class HybridInheritanceDemo5 {
    public static void main(String[] args) {
        Customer3 obj=new Customer3("Punith Ds");
        Product1 obj1=new Product1("two wheeler",25000);
    }
}*/
