package com.sgtest.iodemo;

public class FileOutputStream {

    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent()
    {
        java.io.FileOutputStream fout=null;
        try
        {
            fout=new java.io.FileOutputStream("E:\\DemoFolder\\Test1.txt",true);
            String str="Java is a programming language,";
            str+=" It is used for Application Development.";

            byte b[]=str.getBytes();
            fout.write(b);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
