package net.biryeongtrain.text_emulator.level;

public class condition {
    String condition;
    String operator;
    int value;
    String unit;
    int weight;

    public condition(String condition, String operator, int value, String unit, int weight) {
        this.condition = condition;
        this.operator = operator;
        this.value = value;
        this.unit = unit;
        this.weight = weight;
    }

    public condition(String condition, String operator, int value, String unit){
        this(condition, operator, value, unit, -1);
    }

    public condition(String condition, String operator, String unit){
        this(condition, operator, 1, unit, -1);
    }

    public condition(String condition){
        this(condition, "", 0, "", -1);
    }



    public boolean isPassible(/*플레이어 객체 가져오기*/){
        if(condition.equals("never"))
            return false;
        else if(condition.equals("always"))
            return true;

        boolean k = false;
        switch (operator){
            case "below(>=)":
                if(true/*value >= 플레이어에 unit의 값*/ )
                    k = true;
                break;
            case "more(<=)":
                if(true/*value <= 플레이어에 unit의 값*/ )
                    k = true;
                break;
            case "lower(>)":
                if(true/*value > 플레이어에 unit의 값*/ )
                    k = true;
                break;
            case "over(<)":
                if(true/*value < 플레이어에 unit의 값*/ )
                    k = true;
                break;
            case "equals(==)":
                if(true/*value == 플레이어에 unit의 값*/ )
                    k = true;
                break;
            case "has(only Item)":
                if(true/*플레이어의 slot에 unit이 있는가*/ )
                    k = true;
                break;
            default:
                break;
            }
        if(k && weight != -1)
            if(weight >= (int)(Math.random()*100))
                k = false;

        return k;
    }
}
