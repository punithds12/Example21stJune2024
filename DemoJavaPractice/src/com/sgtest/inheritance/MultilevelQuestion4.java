package com.sgtest.inheritance;
class Vehicle
{
String getvehicleType;
String getvehicleName;
int getvehicleNo;
Vehicle(String vehicleType,String vehicleName,int vehicleNo)
{
    getvehicleType=vehicleType;
    getvehicleName=vehicleName;
    getvehicleNo=vehicleNo;
    System.out.println("Vehicle Type:"+getvehicleType);
    System.out.println("vehicle Name:"+getvehicleName);
    System.out.println("Vehcle Number:"+getvehicleNo);
}
}
class  Vehicle0 extends Vehicle
{
    String getvehicleType;
    String getvehicleName;
    int getvehicleNo;

    Vehicle0(String vehicleType, String vehicleName, int vehicleNo) {
        super(vehicleType, vehicleName, vehicleNo);
        this.getvehicleName=vehicleName;
        this.getvehicleType=vehicleType;
        this.getvehicleNo=vehicleNo;
        System.out.println("Vehicle0 Name:"+vehicleName);
        System.out.println("vehicle0 type:"+vehicleType);
        System.out.println("vehicle0 No:"+vehicleNo);
    }
}
class Vehicle3 extends Vehicle0
{
    String getvehicleName;
    String getvehicleType;
    int getvehicleno;

    Vehicle3(String vehicleType, String vehicleName, int vehicleNo) {
        super(vehicleType, vehicleName, vehicleNo);
        this.getvehicleName=vehicleName;
        this.getvehicleType=vehicleType;
        this.getvehicleno=vehicleNo;
        System.out.println("Vehicle3 Type:"+vehicleType);
        System.out.println("Vehicle3 Name:"+vehicleName);
        System.out.println("VEhicle3 Number:"+vehicleNo);
    }
}
public class MultilevelQuestion4 {
    public static void main(String[] args) {
        Vehicle obj=new Vehicle("Two Wheler","Ducati",4101);
        Vehicle0 obj1=new Vehicle0("4 Wheler","porche",2343);
        Vehicle3 obj3=new Vehicle3("Heavy Truck","Buldozer",1234);
    }
}
