import Controllers.TokenController;
import Models.Vehicle_Type;
import Repositories.*;
import Services.TokenService;
import dtos.IssueTokenRequestDTO;
import dtos.IssueTokenResponseDTO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // controllers --calling--> services --calling--> repositories

        // Repositories
        GateRepository gateRepository = new GateRepository();
        OperatorRepository operatorRepository = new OperatorRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TokenRepository tokenRepository = new TokenRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        // services
        TokenService tokenService = new TokenService(
                gateRepository,
                operatorRepository,
                vehicleRepository,
                parkingLotRepository,
                tokenRepository
        );

        //Controller
        TokenController tokenController = new TokenController(tokenService);

        // request DTO
        IssueTokenRequestDTO requestDTO = new IssueTokenRequestDTO();
        requestDTO.setGateID(1);
        requestDTO.setOwnerName("abc");
        requestDTO.setVehicleNumber("343");
        requestDTO.setOperatorID(34);
        requestDTO.setVehicleType(Vehicle_Type.TWO_WHEELER);

        IssueTokenResponseDTO responseDTO = tokenController.issueToken(requestDTO);

        System.out.println(responseDTO.getStatus());
        System.out.println(responseDTO.getFailureMessage());

    }
}