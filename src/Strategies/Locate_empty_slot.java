package Strategies;

import Models.Gate;
import Models.Parking_Lot;
import Models.Parking_Slot;
import Models.Vehicle_Type;

public interface Locate_empty_slot {
    public Parking_Slot findSlot(Parking_Lot parkingLot, Vehicle_Type vehicleType);
}
