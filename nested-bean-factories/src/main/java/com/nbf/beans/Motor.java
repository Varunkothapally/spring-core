package com.nbf.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motor {
    @Autowired
    private FuelTank fuelTank;

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void runMotor(){
        System.out.println
                ("Motor is running with Fuel Tank of fuel type "
                        +fuelTank.getFuelType()+" with a fuelcapacity of "
                        +fuelTank.getFuelCapacity()+" litres");
    }
}
