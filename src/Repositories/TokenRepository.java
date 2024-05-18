package Repositories;

import Models.Entry_Token;

import java.util.HashMap;
import java.util.Map;

public class TokenRepository {
    private Map<Integer,Entry_Token> entryTokenMap = new HashMap<>();
    private int previousIndex = 0;
    public Entry_Token save(Entry_Token token){
        token.setId(previousIndex);
        entryTokenMap.put(previousIndex,token);
        previousIndex++;

        return token;
    }
}
