package Models;

import java.util.Date;

public class Entry_Token extends Base_Model{
    private Date entryTime;
    private Gate entryGate;
    private Parking_Slot slot;
    private Vehicle vehicle;
    private Operator operator;

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

    public Parking_Slot getSlot() {
        return slot;
    }

    public void setSlot(Parking_Slot slot) {
        this.slot = slot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
