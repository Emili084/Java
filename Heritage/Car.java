public class Car extends Vehicle {
    // Constructor
    public Car(String brand) {
        super(brand);
    }

    // Methods
    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais vroum vroum !";
    }
}