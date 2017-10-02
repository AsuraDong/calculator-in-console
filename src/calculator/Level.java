package calculator;

import java.util.HashMap;

public class Level {
    protected HashMap<String,Integer> level = new HashMap<String,Integer>();
    Level (){
        level.put("+", 1);
        level.put("-", 1);
        level.put("*", 3);
        level.put("/", 3);
        level.put("cos",5);
        level.put("sin",5);
        level.put("sqrt",5);
        level.put("^",6);
        level.put("(", 7);
        level.put(")", 7);
    }
    public void addLevel(String op,int lev) {
        level.put(op, lev);
    }
    public HashMap<String,Integer> getLevel() {
        return level;
    }
}
