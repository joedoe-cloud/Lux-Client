package de.luxclient.setting;


/**
 * Ein einfaches ON/OFF Setting.
 *
 * Beispiel:
 *
 * AutoSprint:
 * true / false
 */
public class BooleanSetting extends Setting<Boolean> {


    public BooleanSetting(
            String name,
            boolean value
    ) {

        super(name, value);
    }



    public void toggle() {

        setValue(!getValue());
    }
}
