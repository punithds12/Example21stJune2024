package com.sgtest.constructorarray;
class Maths3
{
 Maths3(byte x[][])
 {
     int sum=0;
     for(byte i=0;i<x.length;i++)
     {
         for(byte j=0;j<x[i].length;j++)
         {
           sum= sum+x[i][j];
         }
     }
     System.out.println(sum);
 }
}
public class ByteArray {
    public static void main(String[] args) {
        Maths3 obj1=new Maths3(new byte[][]{{1,2,3},{2,5,7},{5,6,7}});
    }
}
