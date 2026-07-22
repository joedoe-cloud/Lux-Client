package de.luxclient.module;

/**
 * Kategorien für Lux Client Module.
 *
 * Diese Enum wird später automatisch von der GUI
 * für die Sidebar verwendet.
 *
 * Neue Kategorien müssen nur hier ergänzt werden.
 */
public enum Category {

    COMBAT("Combat"),

    MACE("Mace"),

    MISC("Misc"),

    MOVEMENT("Movement"),

    SPEAR("Spear"),

    VISUAL("Visual");


    private final String displayName;


    Category(String displayName) {

        this.displayName = displayName;
    }


    /**
     * Anzeigename für GUI.
     */
    public String getDisplayName() {

        return displayName;
    }
}
