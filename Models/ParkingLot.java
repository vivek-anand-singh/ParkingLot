import java.util.List;

public class ParkingLot {
    private Long id;
    private List<ParkingFloor> parkingFloor;
    private List<Gate> gate;
    private Status status;

    public ParkingLot(Long id, List<ParkingFloor> parkingFloor, List<Gate> gate, Status status) {
        this.id = id;
        this.parkingFloor = parkingFloor;
        this.gate = gate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ParkingFloor> getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(List<ParkingFloor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<Gate> getGate() {
        return gate;
    }

    public void setGate(List<Gate> gate) {
        this.gate = gate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
