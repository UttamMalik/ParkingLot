package Models;

public class Vehicle extends Base_Model {
    private String vehicleNumber;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    private String ownerName;
    private Vehicle_Type type;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Vehicle_Type getType() {
        return type;
    }

    public void setType(Vehicle_Type type) {
        this.type = type;
    }
}
