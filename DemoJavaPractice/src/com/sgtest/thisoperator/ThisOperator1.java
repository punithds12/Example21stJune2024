package com.sgtest.thisoperator;
class University
{
    String universityName;
    String location;
    long contactNo;
    String emailId;
    University(String universityName, String location, long contactNo, String emailId)
    {
        this.universityName=universityName;
        this.location=location;
        this.contactNo=contactNo;
        this.emailId=emailId;
        System.out.println("Univerity Name:"+universityName);
        System.out.println("location:"+location);
        System.out.println("contactNo:"+contactNo);
        System.out.println("emailId:"+emailId);
    }
}
class College
{
    String collegeName;
    String departmentName;
    int collegeId;
    String university;
    College(String collegeName,String departmentName,int collegeId,String university  )
    {
        this.collegeName=collegeName;
        this.departmentName=departmentName;
        this.collegeId=collegeId;
        this.university=university;
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
    Student(String studentName,int studentId,String deptName,long contactNo)
    {
        this.studentName=studentName;
        this.studentId=studentId;
        this.deptName=deptName;
        this.contactNo=contactNo;
        System.out.println("Student Name:"+studentName);
        System.out.println("Student ID:"+studentId);
        System.out.println("Department:"+deptName);
        System.out.println("Contact No:"+contactNo);
    }
}
public class ThisOperator1 {
    public static void main(String[] args) {
        University obj1 = new University("Dayananda Sagar University", "KumarSwamy Layout", 8660389253L, "punithds12@gmail.com");
        College obj2= new College("Dayananda Sagar College Of Engineering","Electronics and telecommunication",45,"Dayananda Sagar University");
        Student obj3= new Student("Surya",88,"Mechanical",9535277497L);
    }
}


