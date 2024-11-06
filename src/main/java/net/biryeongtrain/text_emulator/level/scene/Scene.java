package net.biryeongtrain.text_emulator.level.scene;

import net.biryeongtrain.text_emulator.utils.identifier.Identifier;

public class Scene {
    private Condition condition;
    private int weight;
    private Text[] lore;
    private Decision[] Decisions;

    public int getWeight() {
        if(condition.isPassible())
            return weight;
        return 0;
    }

}
