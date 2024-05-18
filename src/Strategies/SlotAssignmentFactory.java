package Strategies;

import Models.SlotAssignmentStrategy;
import Repositories.ParkingLotRepository;

public class SlotAssignmentFactory {
    public  static Locate_empty_slot getSlotAssignmentStrategy(SlotAssignmentStrategy slotAssignmentStrategy){
        switch (slotAssignmentStrategy){
            case RANDOM -> {
                return new Random_slot();
            }
            case NEAREST -> {
                return  new Nearest_First();
            }
            default ->{
                return null;
            }
        }
    }
}
