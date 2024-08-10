package com.sgtest.constructorarray;
class Maths4{
    Maths4(char x[][] )
    {
        String ch=" ";
        for(int i=x.length/2;i<x.length;i++) {
            for (int k = 0; k < x[i].length; k++) {
                if (i == 2) {
                    ch = ch + x[i][k] + " ";
                }
            }
        }
        System.out.println(ch+" ");
    }
}

public class ConcatinationArray2 {
    public static void main(String[] args) {
        Maths4 obj1=new Maths4(new char[][]{{'m','a','n','g','o'},{'o','r','a','g','e'},{'a','p','p','l','e'}});

    }
}



