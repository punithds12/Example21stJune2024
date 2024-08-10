package com.sgtest.overloadingConstructor;
class Counsellor
{
    Counsellor(String counsellorName)
    {
        System.out.println("counsellor Name:"+counsellorName);
    }
    Counsellor(int counsellorAge)
    {
        System.out.println("Counsellor Age:"+counsellorAge);
    }
    Counsellor(long counsellorContactNo)
    {
        System.out.println("contact NO:"+counsellorContactNo);
    }
}

public class OverLoadingConstructor2 {
    public static void main(String[] args) {
        Counsellor obj1=new Counsellor("RAVI");
        Counsellor obj2=new Counsellor(22);
        Counsellor obj3=new Counsellor(8660389253L);
    }
}


