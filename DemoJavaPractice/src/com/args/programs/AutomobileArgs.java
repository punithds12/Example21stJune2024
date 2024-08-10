package com.args.programs;
class LightVehicle{
    String vehicleName;
    String vehicleColour;
    String vehicleWeight;
    int noOfVehicles;
    LightVehicle()

    {
        vehicleName="pulsar";
        vehicleColour="blue white";
        vehicleWeight="180kg";
        noOfVehicles=3;
        System.out.println(vehicleName);
        System.out.println(vehicleColour);
        System.out.println(vehicleWeight);
        System.out.println(noOfVehicles);
    }
}
class LightVehicle1{
    String vehicleName1;
    String vehicleColour1;
    String vehicleWeight1;
    int noOfvehicles1;
    LightVehicle1()
    {
        vehicleName1="I20";
        vehicleColour1="Blue";
        vehicleWeight1="1800";
        noOfvehicles1=1;
        System.out.println(vehicleName1);
        System.out.println(vehicleColour1);
        System.out.println(vehicleWeight1);
        System.out.println(noOfvehicles1);

    }
}
class HeavyVehicle{
    String vehicleName2;
    String vehicleColour2;
    String vehicleWeight2;
    int noOfvehicles2;
    {
        vehicleName2="lorry";
        vehicleColour2="white";
        vehicleWeight2="8000kg";
        noOfvehicles2=2;
        System.out.println(vehicleName2);
        System.out.println(vehicleColour2);
        System.out.println(vehicleWeight2);
        System.out.println(noOfvehicles2);
    }
}
public class AutomobileArgs {
    public static void main(String[] args) {
        LightVehicle obj1=new LightVehicle();
        LightVehicle1 obj2=new LightVehicle1();
        HeavyVehicle obj3=new HeavyVehicle();
    }
}
