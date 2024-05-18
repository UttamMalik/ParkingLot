package Repositories;

import Models.Vehicle;

import java.util.HashMap;
import java.util.Optional;

public class VehicleRepository {
    private HashMap<String ,Vehicle> vehicleHashMap = new HashMap<>();
    public Optional<Vehicle> getVehicleByNumber(String vehicleNumber){
        if(vehicleHashMap.containsKey(vehicleNumber)) return Optional.of(vehicleHashMap.get(vehicleNumber));
        return Optional.empty();
    }
    public Vehicle save(Vehicle vehicle){
        vehicleHashMap.put(vehicle.getVehicleNumber(),vehicle);
        return vehicle;
    }
}
