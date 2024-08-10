package com.sgtest.returnvalues;
class Friends
{
    String[] FriendsName()
    {
        String s[]={"Ravi","Kiran","Aruna"};
        return s;
        }
    }

public class BestFriends {
    public static void main(String[] args) {
        Friends obj=new Friends();
        String s[]= obj.FriendsName();
        for(String val:s)
        {
            System.out.print(val + " z");
        }
    }
}
