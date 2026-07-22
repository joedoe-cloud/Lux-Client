package de.luxclient.module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Zentrale Verwaltung aller Lux Module.
 *
 * Die GUI greift ausschließlich hierauf zu.
 */
public final class ModuleManager {


    private static final List<Module> MODULES =
            new ArrayList<>();


    private ModuleManager() {

    }


    /**
     * Initialisiert alle Module.
     */
    public static void initialize() {


        MODULES.clear();


        /*
         *
         * Beispiel:
         *
         * register(new Sprint());
         * register(new FullBright());
         *
         */
    }



    /**
     * Modul registrieren.
     */
    public static void register(
            Module module
    ) {

        MODULES.add(module);
    }



    /**
     * Alle Module.
     */
    public static List<Module> getModules() {

        return Collections.unmodifiableList(
                MODULES
        );
    }



    /**
     * Module einer Kategorie.
     */
    public static List<Module> getModules(
            Category category
    ) {


        List<Module> result =
                new ArrayList<>();


        for (Module module : MODULES) {


            if (module.getCategory() == category) {

                result.add(module);
            }
        }


        return result;
    }



    /**
     * Suche über Namen.
     */
    public static Module getModule(
            String name
    ) {


        for (Module module : MODULES) {


            if (module.getName()
                    .equalsIgnoreCase(name)) {

                return module;
            }
        }


        return null;
    }



    /**
     * Entfernt alle Module.
     */
    public static void clear() {

        MODULES.clear();
    }
}
