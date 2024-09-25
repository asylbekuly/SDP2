
public class Main {
    public static void main(String[] args) {
        Vehicle fully = new Vehicle.Builder()
                .withengineType("V8")
                .withtransmission("manual").withcolor("red").
                withhasSunroof(true).withnumberOfDoors(4).build();
        System.out.println("Fully car: " + fully);
    }
}