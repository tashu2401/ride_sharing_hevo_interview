package model;


public class Vehicle {
    private String vehicleName;
    private String vehicleNumber;
    //owner
    private User owner;

    public Vehicle(String vehicleName, String vehicleNumber, User owner){
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
        this.owner = owner;
    }

    public String getVehicleName(){
        return vehicleName;
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public User getOwner(){
        return owner;
    }
}
