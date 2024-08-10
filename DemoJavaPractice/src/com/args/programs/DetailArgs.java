package com.args.programs;
class Customer {
    String customerName;
    int age;
    String adress;
    String client;
    {
        customerName="Simha";
        age=24;
        adress="bangalore";
        client="GooGle";
    }
}
class Project{
    String projectName;
    String projectid;
    int noOfmembers;
    String projectEndDay;
    {
        projectName="Debugging";
        projectid="12345";
        noOfmembers=3;
        projectEndDay="today";
        System.out.println(projectName);
        System.out.println(projectid);
        System.out.println(noOfmembers);
        System.out.println(projectEndDay);

    }
}
class Task{
    String taskName;
    String taskDuration;
    int noOfmembers;
    String taskType;

    {
        taskName = "fight";
        taskDuration = "1hour";
        noOfmembers = 2;
        taskType = "wild";
        System.out.println(taskName);
        System.out.println(taskDuration);
        System.out.println(noOfmembers);
        System.out.println(taskType);
    }
}

public class DetailArgs {
    public static void main(String args[])
    {
        Customer obj1=new Customer();
        Project obj2=new Project();
        Task obj3=new Task();
    }

}

