import java.util.List;

public class ParkingSpot {
    private Long id;
    private int spotNumber;
    private List<VehicleType> vehicleType;
    private Status status;
    private ParkingFloor parkingFloor;

    public ParkingSpot(Long id, int spotNumber, List<VehicleType> vehicleType, Status status, ParkingFloor parkingFloor) {
        this.id = id;
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
        this.status = status;
        this.parkingFloor = parkingFloor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public List<VehicleType> getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(List<VehicleType> vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

}
