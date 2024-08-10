package com.sgtest.methods;
class DisplayFirstRow {
    void double1(double a[][]) {
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = a[i].length - 1; j >= 0; j--) {
                if (i == 0) {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}

public class Firstrow {
    public static void main(String[] args) {
        DisplayFirstRow obj1=new DisplayFirstRow();
        obj1.double1(new double [][]{{1,2,3},{4,5,6},{7,8,9}});
}
}
