package model;

import java.util.*;

public class User {
    private String name;
    private String gender;
    private int age;
    //one user -> multiple vehicles
    private List<Vehicle> vehicles;

    public User(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;

        this.vehicles = new ArrayList<>();
    }

    
    public String getName(){
        return this.name;
    }

    //return vehicles owned by user
    public List<Vehicle> getVehicles(){
        return vehicles;
    }

    // add vehicle to user 
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
}

