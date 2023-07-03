public class Boat extends Vehicle {
    // Constructor
    public Boat(String brand) {
        super(brand);
    }

    // Methods
    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais glou glou !";
    }
}