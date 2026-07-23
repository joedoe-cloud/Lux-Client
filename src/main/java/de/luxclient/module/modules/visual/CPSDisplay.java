package de.luxclient.module.modules.visual;

import de.luxclient.module.Category;
import de.luxclient.module.Module;

public class CPSDisplay extends Module {


    public CPSDisplay() {

        super(
                "CPS Display",
                "Displays left and right clicks per second",
                Category.VISUAL
        );

    }


    @Override
    public void onEnable() {

        /*
         * Später:
         *
         * CPS Counter verbinden
         */

    }


    @Override
    public void onDisable() {

        /*
         * Später:
         *
         * Counter stoppen
         */

    }

}
