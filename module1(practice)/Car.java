class Car extends Vehicle {
    private int numberOfDoors;
    private String transmissionType;

    public Car(String mark, String model, int year, int numberOfDoors, String transmissionType) {
        super(mark, model, year);
        this.numberOfDoors = numberOfDoors;
        this.transmissionType = transmissionType;
    }
}