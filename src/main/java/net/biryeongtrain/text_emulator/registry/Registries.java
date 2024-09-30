package net.biryeongtrain.text_emulator.registry;

import net.biryeongtrain.text_emulator.entity.Entity;
import net.biryeongtrain.text_emulator.item.Item;
import net.biryeongtrain.text_emulator.level.Scene;
import net.biryeongtrain.text_emulator.synario.Scenario;
import net.biryeongtrain.text_emulator.utils.identifier.Identifier;

public class Registries {
    private static final Registry<Registry<?>> ROOT = Registries.create(RegistryKey.ofRegistry(RegistryKeys.ROOT), new SimpleRegistry<>(RegistryKey.ofRegistry(RegistryKeys.ROOT)));
    public static final Registry<Scenario> SCENARIO = Registries.create(RegistryKeys.SCENARIO, new SimpleRegistry<>(RegistryKeys.SCENARIO));
    public static final Registry<Item> ITEM = Registries.create(RegistryKeys.ITEM, new SimpleRegistry<>(RegistryKeys.ITEM));
    public static final Registry<Entity> ENTITY = Registries.create(RegistryKeys.ENTITY, new SimpleRegistry<>(RegistryKeys.ENTITY));
    public static final Registry<Scene> SCENE = Registries.create(RegistryKeys.SCENE, new SimpleRegistry<>(RegistryKeys.SCENE));

    public static final Registry<? extends Registry<?>> REGISTRIES = ROOT;

    private static <T, R extends Registry<T>> R create(RegistryKey<? extends Registry<T>> key, R registry) {
        // TODO:  Check Synario BootStrap Logic
        Identifier id = key.getValue();
        ROOT.add((RegistryKey<Registry<?>>) key, registry);
        return registry;
    }

    public static void freeze() {

    }
}