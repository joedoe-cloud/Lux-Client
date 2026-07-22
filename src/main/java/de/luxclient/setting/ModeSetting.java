package de.luxclient.setting;

import java.util.Arrays;
import java.util.Collections;
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


        this.modes =
                Arrays.asList(modes);


        if(!this.modes.contains(defaultMode)
                && !this.modes.isEmpty()) {

            setValue(
                    this.modes.get(0)
            );
        }
    }



    public List<String> getModes() {

        return Collections.unmodifiableList(
                modes
        );
    }



    public void cycle() {


        int index =
                modes.indexOf(
                        getValue()
                );


        index++;


        if(index >= modes.size()) {

            index = 0;
        }


        setValue(
                modes.get(index)
        );
    }



    public boolean is(
            String mode
    ) {

        return getValue()
                .equalsIgnoreCase(mode);
    }
}
