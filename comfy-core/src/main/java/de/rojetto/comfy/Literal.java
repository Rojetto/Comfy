package de.rojetto.comfy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Literal extends CommandNode {
    private final List<String> aliases;

    public Literal(String label, String... aliases) {
        this.aliases = new ArrayList<>();
        this.aliases.add(label);
        this.aliases.addAll(Arrays.asList(aliases));
    }

    @Override
    public boolean matches(String segmentString) {
        for (String alias : aliases) {
            if (alias.equalsIgnoreCase(segmentString)) {
                return true;
            }
        }

        return false;
    }
}