package com.tit.day05javainheritance.singleinheritance.smarthomedevices;

// Creating a class Thermostat to represent specific thermostat devices inheriting from Device (Subclass)
class Thermostat extends Device {
    // Unique attribute for Thermostat
    private double temperatureSetting;

    // Constructor to initialize Thermostat objects with provided values
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Calling the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding the displayStatus() method to include temperature setting information
    @Override
    public void displayStatus() {
        super.displayStatus(); // Calling the superclass method
        System.out.printf("Temperature Setting: %.1f°C%n", temperatureSetting);
    }
}
