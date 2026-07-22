package de.luxclient.setting;


/**
 * Einfacher AN/AUS Wert.
 *
 * Beispiel:
 *
 * Sprint
 * AutoJump
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



    public boolean isEnabled() {

        return getValue();
    }
}
