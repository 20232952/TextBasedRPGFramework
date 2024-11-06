package net.biryeongtrain.text_emulator.level.scene;

public class Decision {
    Condition condition;
    String text;
    Action[] actions;

    public boolean getCondition() {
        return condition.isPassible();
    }
    public String getText() {
        return text;
    }
    public void execute(){
        for (Action action : actions) {
            action.run();
        }
    }
}
