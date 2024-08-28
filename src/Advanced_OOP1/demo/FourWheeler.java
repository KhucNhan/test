package Advanced_OOP1.demo;

class FourWheeler extends Vehicle {
    // Declare a field specific to child class
    private boolean powerSteer; // Variable to store steering informatio

    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer) {
        // Attributes inherited from parent class
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
        // Child class’ own attribute
        powerSteer = pSteer;
    }

//    dùng super
//    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer) {
//        super(vId,vName,numWheels);
//        powerSteer=pSteer;
//    }


    public void showDetails() {
        System.out.println("Vehicle no:" + vehicleNo);
        System.out.println("Vehicle Name:" + vehicleName);
        System.out.println("Number of Wheels:" + wheels);
        if (powerSteer)
            System.out.println("Power Steering:Yes");
        else
            System.out.println("Power Steering:No");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Maximum acceleration:"+ speed + " kmph");
    }
}