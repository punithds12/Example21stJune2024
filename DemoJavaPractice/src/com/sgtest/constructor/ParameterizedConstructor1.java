package com.sgtest.constructor;
class University
{
    String universityName;
    String location;
    long contactNo;
    String emailId;
    University(String Name,String loc,long cont,String email)
    {
        universityName=Name;
        location=loc;
        contactNo=cont;
        emailId=email;
        System.out.println("Univerity Name:"+universityName);
        System.out.println("location:"+loc);
        System.out.println("contactNo:"+cont);
        System.out.println("emailId:"+email);
    }
}
class College
{
    String collegeName;
    String departmentName;
    int collegeId;
    String university;
    College(String CollegeName,String DepartmentName,int CollegeId,String uniName  )
    {
        collegeName=CollegeName;
        departmentName=DepartmentName;
        collegeId=CollegeId;
        university=uniName;
        System.out.println("college Name:"+collegeName);
        System.out.println("Department:"+departmentName);
        System.out.println("college Id:"+collegeId);
        System.out.println("University Name:"+university);
    }
}
class Student
{
    String studentName;
    int studentId;
    String deptName;
    long contactNo;
    Student(String name,int id,String DeptName,long CellNo)
    {
        studentName=name;
        studentId=id;
        deptName=DeptName;
        contactNo=CellNo;
        System.out.println("Student Name:"+studentName);
        System.out.println("Student ID:"+studentId);
        System.out.println("Department:"+deptName);
        System.out.println("Contact No:"+contactNo);
    }
}
public class ParameterizedConstructor1 {
    public static void main(String[] args) {
        University obj1 = new University("Dayananda Sagar University", "KumarSwamy Layout", 8660389253L, "punithds12@gmail.com");
        College obj2= new College("Dayananda Sagar College Of Engineering","Electronics and telecommunication",45,"Dayananda Sagar University");
        Student obj3= new Student("Surya",88,"Mechanical",9535277497L);
    }
}

