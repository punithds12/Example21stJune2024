package com.sgtest.methods;
class Character
{
    void charpz()
    {
        for(char i='p';i<='z';i++)
        {
            System.out.println(i);
        }
    }
}
public class CharacterPToZ {
    public static void main(String[] args) {
        Character obj1=new Character();
        obj1.charpz();
    }
}
