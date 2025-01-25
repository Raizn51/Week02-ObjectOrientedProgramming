package com.tit.day05javainheritance.singleinheritance.smarthomedevices;
/*
Sample Problem 2: Smart Home Devices (Single Inheritance)
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
*/

// Creating a class SmartHomeSystem to demonstrate the functionalities of the Device and Thermostat classes
class SmartHomeSystem {
    public static void main(String[] args) {
        // Creating Thermostat objects
        Thermostat thermostat1 = new Thermostat("TH123", "ON", 22.5);
        Thermostat thermostat2 = new Thermostat("TH124", "OFF", 18.0);

        // Displaying status of the thermostats
        thermostat1.displayStatus();
        thermostat2.displayStatus();
    }
}
