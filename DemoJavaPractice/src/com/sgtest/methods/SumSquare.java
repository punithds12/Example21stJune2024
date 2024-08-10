package com.sgtest.methods;
class SumOfSquare{
    void Square()
        {
            int sum=0;
            for(int i=1;i<=10;i++)
            {
                int squar=i*i;
                 sum=sum+squar;
            }
            System.out.println(sum);
    }
}

public class SumSquare {
    public static void main(String[] args) {
        SumOfSquare obj1=new SumOfSquare();
        obj1.Square();
    }
}
