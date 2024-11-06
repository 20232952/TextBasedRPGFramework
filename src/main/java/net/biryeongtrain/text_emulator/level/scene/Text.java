package net.biryeongtrain.text_emulator.level.scene;

public class Text {
    private Condition condition;
    private String text;

    public boolean getCondition() {
        return condition.isPassible();
    }

    public String getText() {
        return text;
    }
}
