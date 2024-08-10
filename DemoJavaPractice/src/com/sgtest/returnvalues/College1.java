package com.sgtest.returnvalues;
class College
{
   String collegeName(String name)
   {
       return name;
   }
}
public class College1 {
    public static void main(String[] args) {
        College o=new College();
        String v1= o.collegeName("Dayanand Sagar College Of Engineering");
        System.out.println(v1);
    }
}
