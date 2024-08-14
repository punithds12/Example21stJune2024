package com.sgtest.iodemo;
public class FileInputStream {

    public static void main(String[] args) {
        readContent();
    }

    private static void readContent()
    {
        java.io.FileInputStream fin=null;
        int n=0;
        try
        {
            fin=new java.io.FileInputStream("E:\\DemoFolder\\sample1.txt");
            while(true)
            {
                n=fin.read();
                if(n==-1)
                {
                    break;
                }
                char ch=(char) n;
                System.out.print(ch);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
