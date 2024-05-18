package dtos;

import Models.Entry_Token;

public class IssueTokenResponseDTO {
    private Response_status status;
    private Entry_Token token;
    private String failureMessage;

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public Response_status getStatus() {
        return status;
    }

    public void setStatus(Response_status status) {
        this.status = status;
    }

    public Entry_Token getToken() {
        return token;
    }

    public void setToken(Entry_Token token) {
        this.token = token;
    }
}
