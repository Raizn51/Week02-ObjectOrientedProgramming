/*
Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes 
itemName, price, and quantity. 
Add methods to:
	Add an item to the cart.
	Remove an item from the cart.
	Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.
*/

// CartItem class to represent an item in the shopping cart
class CartItem
 {
    // Private fields (attributes) to store item name, price, and quantity
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize the itemName, price, and quantity when creating a new CartItem object
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters to retrieve the item name, price, and quantity
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters to update the quantity of the item
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate the total cost for this item
    public double getTotalCost() {
        return price * quantity;
    }
}

// ShoppingCart class to manage multiple CartItem objects using an array
class ShoppingCart {
    // Array to store CartItem objects
    private CartItem[] cartItems;
    private int itemCount;

    // Constructor to initialize the cartItems array and itemCount
    public ShoppingCart() {
        this.cartItems = new CartItem[10]; // Fixed size array
        this.itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(CartItem item) {
        // Check if the item already exists in the cart
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getItemName().equalsIgnoreCase(item.getItemName())) {
                // If the item exists, update the quantity
                cartItems[i].setQuantity(cartItems[i].getQuantity() + item.getQuantity());
                return;
            }
        }
        // If the item does not exist, add it to the cart
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // Method to remove an item from the cart by item name
    public void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getItemName().equalsIgnoreCase(itemName)) {
                // Shift items to the left to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null; // Clear the last item
                itemCount--;
                return;
            }
        }
        System.out.println("Item not found in the cart.");
    }

    // Method to calculate the total cost of items in the cart
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].getTotalCost();
        }
        return totalCost;
    }

    // Method to display the details of all items in the cart
    public void displayCartDetails() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Item: " + cartItems[i].getItemName() + ", Price: " + cartItems[i].getPrice() +
                    ", Quantity: " + cartItems[i].getQuantity() + ", Total Cost: " + cartItems[i].getTotalCost());
        }
    }
}
// Main class to test the ShoppingCart and CartItem classes
class ShoppingCartDetail 
{
    public static void main(String[] args) 
	{
        // Create ShoppingCart object
        ShoppingCart cart = new ShoppingCart();

        // Create CartItem objects
        CartItem item1 = new CartItem("Apple", 0.5, 10);
        CartItem item2 = new CartItem("Banana", 0.2, 5);
        CartItem item3 = new CartItem("Orange", 0.3, 8);

        // Add items to the cart
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        // Display cart details
        System.out.println("=== Cart Details ===");
        cart.displayCartDetails();

        // Display total cost
        System.out.println("\nTotal Cost: " + cart.getTotalCost());

        // Remove an item from the cart
        cart.removeItem("Banana");

        // Display cart details after removal
        System.out.println("\n=== Cart Details After Removal ===");
        cart.displayCartDetails();

        // Display total cost after removal
        System.out.println("\nTotal Cost After Removal: " + cart.getTotalCost());
    }
}

