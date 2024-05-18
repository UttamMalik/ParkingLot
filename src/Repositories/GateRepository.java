package Repositories;

import Models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Integer,Gate> map = new HashMap<>();
    public Optional<Gate> findGateById(int gateID){
         if(map.containsKey(gateID)) return Optional.of(map.get(gateID));
         else return Optional.empty();
    }
}
