import java.util.List;

public class ParkingFloor {
    private Long id;
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;
    private Status status;

    public ParkingFloor(Long id, int floorNumber, List<ParkingSpot> parkingSpots, Status status) {
        this.id = id;
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
