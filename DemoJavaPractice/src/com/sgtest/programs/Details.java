package com.sgtest.programs;
class Customer {
    String customerName;
    int age;
    String adress;
    String client;
}
class Project{
    String projectName;
    String projectid;
    int noOfmembers;
    String projectEndDay;
}
class Task{
    String taskName;
    String taskDuration;
    int noOfmembers;
    String taskType;

}
public class Details {
    public static void main(String[] args) {
        Customer obj1=new Customer();
        obj1.customerName="kiran";
        obj1.client="HP";
        obj1.age=22;
        obj1.adress="Bangalore";
        System.out.println(obj1.customerName);
        System.out.println(obj1.client);
        System.out.println(obj1.age);
        System.out.println(obj1.adress);
        Project obj2=new Project();
        obj2.projectName="Debugging";
        obj2.projectid="yes";
        obj2.noOfmembers=12;
        obj2.projectEndDay="today";
        System.out.println(obj2.projectName);
        System.out.println(obj2.projectid);
        System.out.println(obj2.noOfmembers);
        System.out.println(obj2.projectEndDay);
        Task obj3=new Task();
        obj3.taskName="fight";
        obj3.noOfmembers=2;
        obj3.taskDuration="1Hour";
        obj3.taskType="morning task";
        System.out.println(obj3.taskName);
        System.out.println(obj3.noOfmembers);
        System.out.println(obj3.taskDuration);
        System.out.println(obj3.taskType);




    }

}
