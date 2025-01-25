package com.tit.day05javainheritance.singleinheritance.smarthomedevices;

// Creating a class Device to represent generic smart home devices (Superclass)
class Device {
    // Declaring protected attributes for the Device class
    protected String deviceId;
    protected String status;

    // Constructor to initialize Device objects with provided values
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status, to be overridden in subclasses if needed
    public void displayStatus() {
        System.out.printf("Device ID: %s, Status: %s%n", deviceId, status);
    }
}
