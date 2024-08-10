package com.args.programs;
class User{
    String userName;
    int userAge;
    String userAdress;
    String userOccupation;
    User()
    {
        userName="punith";
        userAge=20;
        userAdress="bangalore";
        userOccupation="pilot";
        System.out.println(userName);
        System.out.println(userAge);
        System.out.println(userAdress);
        System.out.println(userOccupation);
    }
}
class UserProfile{
    String userName;
    int userAge;
    String userAdress;
    String userOccupation;
    UserProfile()
    {
        userName="ravi";
        userAge=20;
        userAdress="India";
        userOccupation="Soldier";
        System.out.println(userName);
        System.out.println(userAdress);
        System.out.println(userAge);
        System.out.println(userOccupation);
    }
}
class Role{
    String roleName;
    String roleDuration;
    String roleId;
    String roleNumber;
    Role()
    {
        roleName="General Manager";
        roleId="123456";
        roleNumber="123456";
        roleDuration="1Month";
        System.out.println(roleName);
        System.out.println(roleId);
        System.out.println(roleNumber);
        System.out.println(roleDuration);
    }

}
public class Details1Args{
    public static void main(String[] args) {
        User obj1=new User();
        UserProfile obj2=new UserProfile();
        Role obj3=new Role();
    }
}
