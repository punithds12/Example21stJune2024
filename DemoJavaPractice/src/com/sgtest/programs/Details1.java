package com.sgtest.programs;
class User{
    String userName;
    int userAge;
    String userAdress;
    String userOccupation;
}
class UserProfile{
    String userName;
    int userAge;
    String userAdress;
    String userOccupation;
}
class Role{
    String roleName;
    String roleDuration;
    String roleId;
    String roleNumber;

}
public class Details1 {
    public static void main(String[] args) {
        User obj1=new User();
        obj1.userName="punith";
        obj1.userAge=20;
        obj1.userAdress="bangalore";
        obj1.userOccupation="pilot";
        System.out.println(obj1.userName);
        System.out.println(obj1.userAge);
        System.out.println(obj1.userAdress);
        System.out.println(obj1.userOccupation);
        UserProfile obj2=new UserProfile();
        obj2.userName="ravi";
        obj2.userAge=20;
        obj2.userAdress="India";
        obj2.userOccupation="Soldier";
        System.out.println(obj2.userName);
        System.out.println(obj2.userAdress);
        System.out.println(obj2.userAge);
        System.out.println(obj2.userOccupation);
        Role obj3=new Role();
        obj3.roleName="General Manager";
        obj3.roleId="123456";
        obj3.roleNumber="123456";
        obj3.roleDuration="1Month";
        System.out.println(obj3.roleName);
        System.out.println(obj3.roleId);
        System.out.println(obj3.roleNumber);
        System.out.println(obj3.roleDuration);
    }
}
