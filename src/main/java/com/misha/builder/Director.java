package com.misha.builder;

public class Director {
    private VehicleBuilder builder = new VehicleBuilder();

    public Vehicle createMotorcycle(){
        Vehicle motorcycle = builder.setNumberOfWheels(2)
                .setNumberOfLights(1)
                .setColorOfVehicle("Red")
                .build();

        return motorcycle;
    }

    public Vehicle createCar(){
        Vehicle car = builder.setNumberOfWheels(4)
                .setNumberOfLights(2)
                .setColorOfVehicle("Grey")
                .build();

        return car;
    }
}
