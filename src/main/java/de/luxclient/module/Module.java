package de.luxclient.module;

import de.luxclient.setting.Setting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Basisklasse aller Module.
 *
 * Jedes zukünftige Modul erbt hiervon.
 */
public abstract class Module {

    private final String name;
    private final String description;
    private final Category category;

    private boolean enabled;
    private int keybind = -1;

    private final List<Setting<?>> settings = new ArrayList<>();

    protected Module(String name,
                     String description,
                     Category category) {

        this.name = name;
        this.description = description;
        this.category = category;
    }

    /**
     * Wird beim Aktivieren aufgerufen.
     */
    public void onEnable() {
    }

    /**
     * Wird beim Deaktivieren aufgerufen.
     */
    public void onDisable() {
    }

    /**
     * Tick Event.
     */
    public void onUpdate() {
    }

    public final void toggle() {

        enabled = !enabled;

        if (enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }

    public final void setEnabled(boolean enabled) {

        if (this.enabled == enabled) {
            return;
        }

        this.enabled = enabled;

        if (enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }

    /**
     * Fügt ein Setting hinzu.
     */
    protected void addSetting(Setting<?> setting) {
        settings.add(setting);
    }

    public List<Setting<?>> getSettings() {
        return Collections.unmodifiableList(settings);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public int getKeybind() {
        return keybind;
    }

    public void setKeybind(int keybind) {
        this.keybind = keybind;
    }
}
