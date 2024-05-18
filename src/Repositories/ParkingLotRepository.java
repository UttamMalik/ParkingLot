package Repositories;

import Models.Gate;
import Models.Parking_Lot;

public class ParkingLotRepository {
    public Parking_Lot findParkingLotByGate(Gate gate){
        return gate.getParkingLot();
    }
}
