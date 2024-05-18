package Services;

import Models.*;
import Repositories.*;
import Strategies.Locate_empty_slot;
import Strategies.SlotAssignmentFactory;

import java.util.Date;
import java.util.Optional;

public class TokenService {
    private GateRepository gateRepository;
    private OperatorRepository operatorRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TokenRepository tokenRepository;
    public TokenService(GateRepository gateRepository,
                        OperatorRepository operatorRepository,
                        VehicleRepository vehicleRepository,
                        ParkingLotRepository parkingLotRepository,
                        TokenRepository tokenRepository){
        this.gateRepository = gateRepository;
        this.operatorRepository = operatorRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.tokenRepository = tokenRepository;
    }
    public Entry_Token issueToken(
            int gateID,
            int operatorID,
            Vehicle_Type vehicleType,
            String vehicleNumber,
            String ownerName
    )
    {
        // 1. Create the Token Object
        Entry_Token token = new Entry_Token();
        // 2. set the time
        token.setEntryTime(new Date());
        // 3. get the gate by GateID --> we will use GateRepository to find the gate by the gate ID
        Optional<Gate> gateOptional = gateRepository.findGateById(gateID);
        if(gateOptional.isEmpty()) throw new RuntimeException("Invalid Gate");
        token.setEntryGate(gateOptional.get());

        // 4. get the operator
        Optional<Operator> operatorOptional = operatorRepository.findOperatorById(operatorID);
        if(operatorOptional.isEmpty()) throw new RuntimeException("Invalid Opertor details !!");
        token.setOperator(operatorOptional.get());

        // 5. setting the vehicle
        Optional<Vehicle> vehicleOptional = vehicleRepository.getVehicleByNumber(vehicleNumber);
        Vehicle currVehicle;
        if(vehicleOptional.isEmpty()){
            Vehicle newVehicle = new Vehicle();
            newVehicle.setVehicleNumber(vehicleNumber);
            newVehicle.setOwnerName(ownerName);
            currVehicle = vehicleRepository.save(newVehicle);
        }
        else
            currVehicle = vehicleOptional.get();

        token.setVehicle(currVehicle);

        // 6. setting the parking slot
        Parking_Lot parkingLot = parkingLotRepository.findParkingLotByGate(gateOptional.get());
        Locate_empty_slot locateEmptySlot = SlotAssignmentFactory.getSlotAssignmentStrategy(parkingLot.getSlotAssignmentStrategy());
        Parking_Slot slot = locateEmptySlot.findSlot(parkingLot,vehicleType);

        slot.setStatus(Slot_Status.OCCUPIED);
        token.setSlot(slot);

        Entry_Token savedToken =  tokenRepository.save(token);
        return savedToken;
    }
}
