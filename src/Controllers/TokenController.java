package Controllers;

import Models.Entry_Token;
import Services.TokenService;
import dtos.IssueTokenRequestDTO;
import dtos.IssueTokenResponseDTO;
import dtos.Response_status;

public class TokenController {
    // DTO :- data transfer object
    private TokenService tokenService;
    public TokenController(TokenService tokenService){
        this.tokenService = tokenService;
    }
    public IssueTokenResponseDTO issueToken(IssueTokenRequestDTO issueTokenRequestDTO)
    {
        IssueTokenResponseDTO responseDTO = new IssueTokenResponseDTO();
        try{
            Entry_Token token = tokenService.issueToken(
                    issueTokenRequestDTO.getGateID(),
                    issueTokenRequestDTO.getOperatorID(),
                    issueTokenRequestDTO.getVehicleType(),
                    issueTokenRequestDTO.getVehicleNumber(),
                    issueTokenRequestDTO.getOwnerName()
            );

            responseDTO.setToken(token);
            responseDTO.setStatus(Response_status.SUCCESS);
            return responseDTO;
        }catch (Exception ex)
        {
            responseDTO.setStatus(Response_status.FAILURE);
            responseDTO.setFailureMessage(ex.getMessage());
            return responseDTO;
        }
    }
}
