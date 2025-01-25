package com.tit.javaencapsulationpolymorphismabstraction.fooddeliverysystem;

/*

Problem 6: Online Food Delivery System
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.

Goal: Understand inheritance and polymorphism by modeling a real-world relationship where different types of food items inherit from a common superclass and override methods as needed.
*/

import java.util.ArrayList;
import java.util.List;

// Creating a class FoodDeliverySystem to demonstrate the functionalities of the FoodItem and its subclasses
class FoodDeliverySystem {
    public static void main(String[] args) {
        // Creating a list to store food items
        List<FoodItem> foodItems = getFoodItems();

        // Processing and displaying details of each food item using polymorphism
        for (FoodItem foodItem : foodItems) {
            foodItem.getItemDetails();
            double totalPrice = foodItem.calculateTotalPrice();
            System.out.println("Total Price: " + totalPrice);
            ((Discountable) foodItem).getDiscountDetails();
            ((Discountable) foodItem).applyDiscount(10); // Trying to apply 10% discount
            double finalPrice = foodItem.calculateTotalPrice();
            System.out.println("Final Price after Discount: " + finalPrice);
            System.out.println();
        }
    }

    private static List<FoodItem> getFoodItems() {
        List<FoodItem> foodItems = new ArrayList<>();

        // Creating objects for each food item type and adding them to the list
        VegItem paneerTikka = new VegItem("Paneer Tikka", 200, 2);
        paneerTikka.setDiscountAvailable(true);
        foodItems.add(paneerTikka);

        NonVegItem chickenBiryani = new NonVegItem("Chicken Biryani", 250, 3, 50);
        chickenBiryani.setDiscountAvailable(false);
        foodItems.add(chickenBiryani);

        VegItem vegBurger = new VegItem("Veg Burger", 100, 5);
        vegBurger.setDiscountAvailable(true);
        foodItems.add(vegBurger);

        NonVegItem fishCurry = new NonVegItem("Fish Curry", 300, 2, 75);
        fishCurry.setDiscountAvailable(true);
        foodItems.add(fishCurry);
        return foodItems;
    }
}
