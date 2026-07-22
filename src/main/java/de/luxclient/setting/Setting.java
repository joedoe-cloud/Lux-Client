package de.luxclient.setting;


/**
 * Basisklasse für alle Settings.
 *
 * Jede Einstellung im Client erbt hiervon.
 *
 * Beispiele:
 * - BooleanSetting
 * - NumberSetting
 * - RangeSetting
 * - ModeSetting
 * - KeybindSetting
 */
public abstract class Setting<T> {


    private final String name;


    private T value;



    protected Setting(String name, T value) {

        this.name = name;
        this.value = value;
    }



    public String getName() {

        return name;
    }



    public T getValue() {

        return value;
    }



    public void setValue(T value) {

        this.value = value;
    }
}
