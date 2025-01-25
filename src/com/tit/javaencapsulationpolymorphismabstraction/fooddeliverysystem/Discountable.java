package com.tit.javaencapsulationpolymorphismabstraction.fooddeliverysystem;

// Creating an interface Discountable with methods for discount-related actions
interface Discountable {
    void applyDiscount(double percentage);
    boolean isDiscountAvailable();
    void setDiscountAvailable(boolean available);
    void getDiscountDetails();
}
