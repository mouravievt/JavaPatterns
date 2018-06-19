package com.misha.builder;

public class VehicleBuilder {
    private int numberOfWheels;
    private int numberOfLights;
    private String colorOfVehicle;

    public VehicleBuilder setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    public VehicleBuilder setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
        return this;
    }

    public VehicleBuilder setColorOfVehicle(String colorOfVehicle) {
        this.colorOfVehicle = colorOfVehicle;
        return this;
    }

    public Vehicle build(){
        Vehicle vehicle = new Vehicle();

        vehicle.setColorOfVehicle(this.colorOfVehicle);
        vehicle.setNumberOfWheels(this.numberOfWheels);
        vehicle.setNumberOfLights(this.numberOfLights);
        return vehicle;
    }
}
