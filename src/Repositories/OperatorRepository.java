package Repositories;

import Models.Operator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperatorRepository {
    private Map<Integer,Operator> operatorMap = new HashMap<>();
    public Optional<Operator> findOperatorById(int operatorID){
        if(operatorMap.containsKey(operatorID)) return Optional.of(operatorMap.get(operatorID));
        return Optional.empty();
    }
}
