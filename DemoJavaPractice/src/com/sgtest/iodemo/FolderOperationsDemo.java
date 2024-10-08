package com.sgtest.iodemo;

import java.io.File;

public class FolderOperationsDemo {

    public static void main(String[] args) {
        //createFolder();
         // createNestedFolder();
        //  renameFolder();
          // deleteFolder();
        folderCollections();
    }


    private static void createFolder()
    {
        File f1=new File("E:\\Demo1\\HelloWorld");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
    }

    private static void createNestedFolder()
    {
        File f1=new File("E:\\Demo1\\Hello1\\Hello2\\Hello3\\Hello4");
        boolean v1=f1.mkdirs();
        System.out.println("Whether it creates a Nested Folder :"+v1);
    }

    private static void renameFolder()
    {
        File f1=new File("E:\\Demo1\\HelloWorld");
        File f2=new File("E:\\Demo1\\HelloWorldNew");
        boolean v1=f1.renameTo(f2);
        System.out.println("Whether Folder has renamed ?:"+v1);
    }
// whether it is nested folder we can't delete the folder
    private static void deleteFolder()
    {
        File f1=new File("E:\\Demo1\\Hello1");
        boolean v1=f1.delete();
        System.out.println("whether Folder has deleted ?:"+v1);
    }

    private static void folderCollections()
    {
        File f1=new File("E:\\Demo1");
        File[] f2=f1.listFiles();
        for(int i=0;i<f2.length;i++)
        {
            if(f2[i].isDirectory()==true)
            {
                String path=f2[i].getAbsolutePath();
                System.out.println(path);
            }
        }
    }
}

