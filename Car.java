class Car {
    // Field (Instance Variable)
    String brand;  // Stores the brand of the car

    // Constructor
    Car(String brandName) {
        brand = brandName;
    }

    // Method to display the brand
    void showBrand() {
        System.out.println("Car Brand: " + brand);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota"); // Creating an object
        myCar.showBrand(); // Calling method to display field value
    }
}
