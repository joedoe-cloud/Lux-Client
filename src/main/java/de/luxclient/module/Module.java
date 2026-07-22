package de.luxclient.module;

import de.luxclient.setting.Setting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Basisklasse aller Lux Client Module.
 *
 * Jedes Modul besitzt:
 *
 * - Name
 * - Beschreibung
 * - Kategorie
 * - Aktivierungsstatus
 * - Settings
 *
 * Keybinds werden NICHT als Setting gespeichert.
 *
 * Die Verwaltung erfolgt später zentral
 * über den KeybindManager.
 */
public abstract class Module {


    private final String name;

    private final String description;

    private final Category category;


    private boolean enabled;


    private final List<Setting<?>> settings =
            new ArrayList<>();


    protected Module(
            String name,
            String description,
            Category category
    ) {

        this.name = name;

        this.description = description;

        this.category = category;
    }


    /**
     * Wird beim Aktivieren ausgeführt.
     */
    protected void onEnable() {

    }


    /**
     * Wird beim Deaktivieren ausgeführt.
     */
    protected void onDisable() {

    }


    /**
     * Wird jeden Client Tick ausgeführt.
     */
    protected void onUpdate() {

    }


    /**
     * Wird beim Rendering ausgeführt.
     */
    protected void onRender(float tickDelta) {

    }


    /**
     * Aktiviert oder deaktiviert das Modul.
     */
    public final void toggle() {

        setEnabled(!enabled);
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
     * Fügt ein GUI-kompatibles Setting hinzu.
     */
    protected final void addSetting(
            Setting<?> setting
    ) {

        settings.add(setting);
    }


    /**
     * Gibt alle Settings zurück.
     *
     * Die GUI liest ausschließlich diese Liste.
     */
    public final List<Setting<?>> getSettings() {

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
}
