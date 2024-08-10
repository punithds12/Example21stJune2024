package com.sgtest.returnvalues;
class Even
{
    int[] display()
    {
     int s[]={10,12,14,16,18,20};
     return s;
    }

}

public class EvenNumbers {
    public static void main(String[] args) {
        Even obj1=new Even();
        int s[]= obj1.display();
        for(int val:s)
        {
            System.out.println(val);
        }
    }
}
