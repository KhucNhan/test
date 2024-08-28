package Advanced_OOP1.demo;
public class Vehicle {
    // Declare common attributes of a vehicle
    protected String vehicleNo; // Variable to store vehicle number
    protected String vehicleName; // Variable to store vehicle name
    protected int wheels;
    public void accelerate(int speed) {
        System.out.println("Accelerating at:”+ speed + “ kmph");
    }
}
