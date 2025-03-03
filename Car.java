class Car {
    String model;
    Car(String m){
        model = m;
    }
    void display() {
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Car myCar = new Car("punto");
        myCar.display();
    }
}
