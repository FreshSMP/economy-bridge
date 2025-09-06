package su.nightexpress.economybridge.item;

import org.jetbrains.annotations.NotNull;
import su.nightexpress.nightcore.util.Lists;

import java.util.List;

public class ItemPlugins {

    public static final String EXCELLENT_CRATES = "ExcellentCrates";
    public static final String ITEMS_ADDER      = "ItemsAdder";

    @NotNull
    public static List<String> values() {
        return Lists.newList(EXCELLENT_CRATES, ITEMS_ADDER);
    }
}
