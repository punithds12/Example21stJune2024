package com.sgtest.constructorarray;
class Double {
    Double(int x[]) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] / 2;
            System.out.println(x[i]);
        }
    }
}
public class DisplayHalfValue {
    public static void main(String[] args) {
        Double obj1=new Double(new int[]{2,23,5,3,58,35,5,54,});
    }
}
