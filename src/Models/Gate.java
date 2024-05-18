package Models;

public class Gate extends Base_Model{

    private int GateNumber;
    private int FloorNumber;
    private Gate_Type type;
    private Gate_Status status;

    private Parking_Lot parkingLot;

    public Parking_Lot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(Parking_Lot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public int getGateNumber() {
        return GateNumber;
    }

    public void setGateNumber(int gateNumber) {
        GateNumber = gateNumber;
    }

    public int getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        FloorNumber = floorNumber;
    }

    public Gate_Type getType() {
        return type;
    }

    public void setType(Gate_Type type) {
        this.type = type;
    }

    public Gate_Status getStatus() {
        return status;
    }

    public void setStatus(Gate_Status status) {
        this.status = status;
    }
}
