package Models;

import java.util.List;

public class Parking_Floor extends Base_Model{
    private int FloorNumber;
    private List<Parking_Slot> parkingSlots;
    private Floor_Status status;

    public int getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        FloorNumber = floorNumber;
    }

    public List<Parking_Slot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<Parking_Slot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public Floor_Status getStatus() {
        return status;
    }

    public void setStatus(Floor_Status status) {
        this.status = status;
    }
}
