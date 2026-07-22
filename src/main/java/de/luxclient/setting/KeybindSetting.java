package de.luxclient.setting;


/**
 * Speichert eine Taste.
 *
 * Wird später mit dem KeybindManager verbunden.
 */
public class KeybindSetting extends Setting<Integer> {


    public KeybindSetting(
            String name,
            int key
    ) {

        super(name, key);
    }



    public boolean hasKey() {

        return getValue() != -1;
    }



    public void clear() {

        setValue(-1);
    }
}
