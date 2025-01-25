package com.tit.javaencapsulationpolymorphismabstraction.ridehailingapp;

// Creating an interface GPS with methods for GPS-related actions
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}