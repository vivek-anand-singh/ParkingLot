public class Vehicle {
    private long id;
    private int number;
    private VehicleType type;
    private String owner;

    public Vehicle(long id, int number, VehicleType type, String owner) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
