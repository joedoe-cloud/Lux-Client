package de.luxclient.setting;

import java.util.Arrays;
import java.util.List;


/**
 * Auswahl aus mehreren Modi.
 *
 * Beispiel:
 *
 * Mode:
 * Normal
 * Legit
 * Aggressive
 */
public class ModeSetting extends Setting<String> {


    private final List<String> modes;



    public ModeSetting(
            String name,
            String defaultMode,
            String... modes
    ) {

        super(name, defaultMode);

        this.modes = Arrays.asList(modes);
    }



    public List<String> getModes() {

        return modes;
    }



    public void cycle() {

        int current =
                modes.indexOf(getValue());


        int next =
                current + 1;


        if (next >= modes.size()) {

            next = 0;
        }


        setValue(
                modes.get(next)
        );
    }



    public boolean is(String mode) {

        return getValue()
                .equalsIgnoreCase(mode);
    }
}
