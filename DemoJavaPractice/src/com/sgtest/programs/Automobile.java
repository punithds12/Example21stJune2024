package com.sgtest.programs;
class LightVehicle{
String vehicleName;
String vehicleColour;
String VehicleWeight;
int noOfVehicles;
}
class LightVehicle1{
    String vehicleName1;
    String vehjicleColour1;
    String vehicleWeight1;
    int noOfvehicles1;
}
class HeavyVehicles{
    String vehicleName2;
    String vehjicleColour2;
    String vehicleWeight2;
    int noOfvehicles2;
}

public class Automobile {
    public static void main(String[] args) {
        LightVehicle obj1 = new LightVehicle();
        obj1.vehicleName = "pulsar";
        obj1.vehicleColour = "Blue White";
        obj1.VehicleWeight = "170kg";
        obj1.noOfVehicles = 1;
        System.out.println(obj1.vehicleName);
        System.out.println(obj1.vehicleColour);
        System.out.println(obj1.VehicleWeight);
        System.out.println(obj1.noOfVehicles);
        LightVehicle1 obj2 = new LightVehicle1();
        obj2.vehicleName1 = "i20";
        obj2.vehjicleColour1 = "Blue";
        obj2.vehicleWeight1 = "1000kg";
        obj2.noOfvehicles1 = 1;
        System.out.println(obj2.vehicleName1);
        System.out.println(obj2.vehjicleColour1);
        System.out.println(obj2.vehicleWeight1);
        System.out.println(obj2.noOfvehicles1);
        HeavyVehicles obj3 = new HeavyVehicles();
        obj3.vehicleName2 = "truck";
        obj3.vehjicleColour2 = "red";
        obj3.vehicleWeight2 = "3000kg";
        System.out.println(obj3.vehicleName2);
        System.out.println(obj3.vehjicleColour2);
        System.out.println(obj3.vehjicleColour2);
        System.out.println(obj3.noOfvehicles2);
    }
}