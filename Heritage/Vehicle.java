public abstract class Vehicle {
    // Attributes
    private String brand;
    private int kilometers;
 
    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
        this.kilometers = kilometers;
    }
 
    // Getters
    public String getBrand() {
        return this.brand;
    }
 
    public int getKilometers() {
        return this.kilometers;
    }
 
    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
 
    // Methods
    public abstract String doStuff();
 
}