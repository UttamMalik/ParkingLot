package Models;

public class Parking_Slot extends Base_Model{
    private Parking_Floor floor;
    private Slot_Status status;
    private Vehicle_Type supportedVehicle;
    private Parking_Lot parkingLot;

    public Parking_Floor getFloor() {
        return floor;
    }

    public void setFloor(Parking_Floor floor) {
        this.floor = floor;
    }

    public Slot_Status getStatus() {
        return status;
    }

    public void setStatus(Slot_Status status) {
        this.status = status;
    }

    public Vehicle_Type getSupportedVehicle() {
        return supportedVehicle;
    }

    public void setSupportedVehicle(Vehicle_Type supportedVehicle) {
        this.supportedVehicle = supportedVehicle;
    }

    public Parking_Lot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(Parking_Lot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
