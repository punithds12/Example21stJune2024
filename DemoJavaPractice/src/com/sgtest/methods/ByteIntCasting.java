package com.sgtest.methods;
class ByteInt
{
    void biteInt(byte a[])
    {
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
             b[i]=a[i];
            System.out.println(b[i]);
        }
    }
}
public class ByteIntCasting {
    public static void main(String[] args) {
        ByteInt obj1=new ByteInt();
         byte a[]={1,3,4,34,45,67,88};
         obj1.biteInt(a);

    }
}
