package de.luxclient.module;

/**
 * Kategorien für Module.
 * Diese werden später automatisch in der Sidebar
 * der ClickGUI angezeigt.
 */
public enum Category {

    COMBAT("Combat"),
    MOVEMENT("Movement"),
    PLAYER("Player"),
    RENDER("Render"),
    MISC("Misc");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Anzeigename für die GUI.
     */
    public String getDisplayName() {
        return displayName;
    }
}
