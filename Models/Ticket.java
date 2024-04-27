import java.util.Date;

public class Ticket {
    private long id;
    private long number;
    private Vehicle vehicle;
    private ParkingSpot spot;
    private Date entryTime;
    private Gate entryGate;
    private Status status;

    public Ticket(long id, long number, Vehicle vehicle, ParkingSpot spot, Date entryTime, Gate entryGate, Status status) {
        this.id = id;
        this.number = number;
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = entryTime;
        this.entryGate = entryGate;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public void setSpot(ParkingSpot spot) {
        this.spot = spot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
