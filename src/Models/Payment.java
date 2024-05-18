package Models;

public class Payment extends Base_Model{
    private Payment_Mode mode;
    private int amount;
    // reference number of the payment done
    private int reference_number;

    private Payment_Status status;

    public Payment_Status getStatus() {
        return status;
    }

    public void setStatus(Payment_Status status) {
        this.status = status;
    }

    public Payment_Mode getMode() {
        return mode;
    }

    public void setMode(Payment_Mode mode) {
        this.mode = mode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getReference_number() {
        return reference_number;
    }

    public void setReference_number(int reference_number) {
        this.reference_number = reference_number;
    }
}
