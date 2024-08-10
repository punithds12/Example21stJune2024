package com.sgtest.programs;

import java.security.spec.RSAOtherPrimeInfo;

class Employee {
    String firstName;
    String employeeRole;
    String companyName;
    int employeeSalary;
}
class Department {
    String departmentName;
    String hod;
    int noOfstudents;
    int noOfstaffs;
}
class Insurance {
String insuranceName;
String insurerName;
String insuranceType;
int insuranceNo;
}
public class Sample {
    public static void main(String[] args) {
        Employee obj1 =new Employee();
        obj1.firstName="DR Shree Lekha";
        obj1.employeeRole="Doctor";
        obj1.companyName="Shree Lekha Hospital";
        obj1.employeeSalary=30000;
        System.out.println(obj1.firstName);
        System.out.println(obj1.employeeRole);
        System.out.println(obj1.companyName);
        System.out.println(obj1.employeeSalary);
        Department obj2=new Department();
        obj2.departmentName="Electronics Communication";
        obj2.hod="Kiran";
        obj2.noOfstudents=50;
        obj2.noOfstaffs=12;
        System.out.println(obj2.departmentName);
        System.out.println(obj2.hod);
        System.out.println(obj2.noOfstudents);
        System.out.println(obj2.noOfstaffs);
        Insurance obj3=new Insurance();
        obj3.insuranceName="ackoInsurance";
        obj3.insurerName="punith";
        obj3.insuranceType="Bike insurance";
        obj3.insuranceNo=89648327;
        System.out.println(obj3.insuranceName);
        System.out.println(obj3.insurerName);
        System.out.println(obj3.insuranceType);
        System.out.println(obj3.insuranceNo);
    }

}
