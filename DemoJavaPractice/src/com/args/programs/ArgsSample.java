package com.args.programs;

class Employee {
    String firstName;
    String employeeRole;
    String companyName;
    int employeeSalary;
    Employee()
    {
        firstName="DR Shree Lekha";
        employeeRole="Doctor";
        companyName="Shree Lekha Hospital";
        employeeSalary=30000;
        System.out.println(firstName);
        System.out.println(employeeRole);
        System.out.println(companyName);
        System.out.println(employeeSalary);
    }
}
class Department {
    String departmentName;
    String hod;
    int noOfstudents;
    int noOfstaffs;
    Department()
    {
        departmentName="Electronics Communication";
        hod="Kiran";
        noOfstudents=50;
        noOfstaffs=12;
        System.out.println(departmentName);
        System.out.println(hod);
        System.out.println(noOfstudents);
        System.out.println(noOfstaffs);
    }
}
class Insurance {
    String insuranceName;
    String insurerName;
    String insuranceType;
    int insuranceNo;
    Insurance()
    {
        insuranceName="ackoInsurance";
        insurerName="punith";
        insuranceType="Bike insurance";
        insuranceNo=89648327;
        System.out.println(insuranceName);
        System.out.println(insurerName);
        System.out.println(insuranceType);
        System.out.println(insuranceNo);
    }
}
public class ArgsSample{
    public static void main(String[] args)
    {
        Employee obj1=new Employee();
        Department obj2=new Department();
        Insurance obj3=new Insurance();
    }
}

