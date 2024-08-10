package com.sgtest.constructorarray;
class Maths2{
    Maths2(String[][] x)
    {
        String str=" ";
        for(int i=x.length/2;i<x.length;i++)
        {
            for (int k=0;k<x[i].length;k++)
            {
                if(i==1)
                str=str+x[i][k]+" ";
            }
        }
        System.out.println(str+" ");
    }
}

public class ConcatinationArray {
    public static void main(String[] args) {
        Maths2 obj1=new Maths2(new String[][]{{"MANGO","ORANGE","APPLE"},{"Punith","Kiran","Ravi"},{"Box","Ball","Bat"}});

    }
}
