public class Hangar {
    public static void main(String[] args) {
        // Create instances of Car and Boat
        Car clio = new Car("Clio");
        Boat titanic = new Boat("Titanic");

        // Display the result of the doStuff() method called on the instances
        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}