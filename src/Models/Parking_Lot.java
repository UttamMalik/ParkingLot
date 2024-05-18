package Models;

import java.util.List;

public class Parking_Lot extends Base_Model{
    private List<Parking_Floor> floorList;
    private List<Gate> gates;
    private String address;
    private int capacity;
    private Parking_Lot_Status status;

    private SlotAssignmentStrategy slotAssignmentStrategy;

    public SlotAssignmentStrategy getSlotAssignmentStrategy() {
        return slotAssignmentStrategy;
    }

    public void setSlotAssignmentStrategy(SlotAssignmentStrategy slotAssignmentStrategy) {
        this.slotAssignmentStrategy = slotAssignmentStrategy;
    }

    public List<Parking_Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Parking_Floor> floorList) {
        this.floorList = floorList;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Parking_Lot_Status getStatus() {
        return status;
    }

    public void setStatus(Parking_Lot_Status status) {
        this.status = status;
    }
}
