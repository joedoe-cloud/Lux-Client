package de.luxclient.module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Verwaltet alle Module.
 */
public final class ModuleManager {

    private static final List<Module> MODULES = new ArrayList<>();

    private ModuleManager() {
    }

    /**
     * Wird später beim Clientstart aufgerufen.
     */
    public static void initialize() {

        MODULES.clear();

        /*
         * Module werden später hier registriert.
         *
         * Beispiel:
         *
         * register(new Sprint());
         * register(new FullBright());
         */
    }

    /**
     * Registriert ein Modul.
     */
    public static void register(Module module) {
        MODULES.add(module);
    }

    /**
     * Alle Module.
     */
    public static List<Module> getModules() {
        return Collections.unmodifiableList(MODULES);
    }

    /**
     * Alle Module einer Kategorie.
     */
    public static List<Module> getModules(Category category) {

        List<Module> modules = new ArrayList<>();

        for (Module module : MODULES) {

            if (module.getCategory() == category) {
                modules.add(module);
            }
        }

        return modules;
    }

    /**
     * Modul anhand des Namens suchen.
     */
    public static Module getModule(String name) {

        for (Module module : MODULES) {

            if (module.getName().equalsIgnoreCase(name)) {
                return module;
            }
        }

        return null;
    }
}
