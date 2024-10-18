package net.biryeongtrain.text_emulator.level;

public class SceneCondition {
    String condition;
    String operator;
    int value;
    String unit;
    int weight;

    public SceneCondition(String condition, String operator, int value, String unit, int weight) {
        this.condition = condition;
        this.operator = operator;
        this.value = value;
        this.unit = unit;
        this.weight = weight;
    }

    public SceneCondition(String condition, String operator, String unit){
        this(condition, operator, 1, unit, -1);
    }

    public SceneCondition(String condition, int weight){
        this(condition, "", 0, "", weight);
    }



    public int getWeight(/*플레이어 객체 가져오기*/){
        boolean k = false;

        switch (condition) {
            case "never":
                k = false;
                break;
            case "always":
                k = true;
                break;
            case "if":
                switch (operator) {
                    case "below(>=)":
                        if (true/*value >= 플레이어에 unit의 값*/)
                            k = true;
                        break;
                    case "more(<=)":
                        if (true/*value <= 플레이어에 unit의 값*/)
                            k = true;
                        break;
                    case "lower(>)":
                        if (true/*value > 플레이어에 unit의 값*/)
                            k = true;
                        break;
                    case "over(<)":
                        if (true/*value < 플레이어에 unit의 값*/)
                            k = true;
                        break;
                    case "equals(==)":
                        if (true/*value == 플레이어에 unit의 값*/)
                            k = true;
                        break;
                    case "has(only Item)":
                        if (true/*플레이어의 slot에 unit이 있는가*/)
                            k = true;
                        break;
                    default:
                        break;
                }
            break;
        }

        if(k)
            return weight;
        return 0;
    }
}
