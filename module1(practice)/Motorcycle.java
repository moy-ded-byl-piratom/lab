class Motorcycle extends Vehicle{
    private String bodyType;
    private boolean hasSidecar;

    public Motorcycle(String mark, String model, int year, String bodyType, boolean hasSidecar) {
        super(mark, model, year);
        this.bodyType = bodyType;
        this.hasSidecar = hasSidecar;
    }
}
