package Strategies;

import Models.*;
import Repositories.ParkingLotRepository;

public class Random_slot implements Locate_empty_slot{

    @Override
    public Parking_Slot findSlot(Parking_Lot parkingLot, Vehicle_Type vehicleType) {

        for(Parking_Floor parkingFloor : parkingLot.getFloorList()){
            for(Parking_Slot parkingSlot : parkingFloor.getParkingSlots()){
                if(parkingSlot.getSupportedVehicle().contains(vehicleType) &&
                        parkingSlot.getStatus().equals(Slot_Status.EMPTY)
                )
                    return parkingSlot;
            }
        }

        return null;
    }
}
