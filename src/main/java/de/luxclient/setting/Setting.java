package de.luxclient.setting;


/**
 * Basis aller Modul-Einstellungen.
 *
 * Settings enthalten nur Daten.
 *
 * Die GUI entscheidet später selbst,
 * wie diese dargestellt werden.
 */
public abstract class Setting<T> {


    private final String name;


    private T value;



    protected Setting(
            String name,
            T value
    ) {

        this.name = name;

        this.value = value;
    }



    public String getName() {

        return name;
    }



    public T getValue() {

        return value;
    }



    public void setValue(
            T value
    ) {

        this.value = value;
    }
}
