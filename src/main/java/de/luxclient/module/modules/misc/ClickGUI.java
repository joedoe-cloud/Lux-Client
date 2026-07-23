package de.luxclient.module.modules.misc;

import de.luxclient.module.Category;
import de.luxclient.module.Module;

public class ClickGUI extends Module {


    public ClickGUI() {

        super(
                "ClickGUI",
                "Opens the Lux Client ClickGUI",
                Category.MISC
        );

    }


    @Override
    public void onEnable() {

        /*
         * Später:
         *
         * MinecraftClient.setScreen(
         *      new LuxScreen()
         * );
         *
         * Die GUI selbst bleibt unabhängig.
         */


        disable();

    }

}
