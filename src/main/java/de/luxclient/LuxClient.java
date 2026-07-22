package de.luxclient;

import de.luxclient.module.ModuleManager;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Main entry point of Lux Client.
 *
 * This class is loaded by Fabric when Minecraft starts.
 *
 * Future systems:
 * - ModuleManager
 * - ConfigManager
 * - ClickGUI
 * - EventBus
 */
public class LuxClient implements ClientModInitializer {


    public static final String NAME = "Lux Client";

    public static final String VERSION = "v1";


    public static final Logger LOGGER =
            LoggerFactory.getLogger("LuxClient");



    @Override
public void onInitializeClient() {


    LOGGER.info(
            "{} {} initialized.",
            NAME,
            VERSION
    );


    ModuleManager.initialize();


    LOGGER.info(
            "Managers initialized."
    );
}


        /*
         * Future initialization:

           ModuleManager.init();

           ConfigManager.load();

           EventManager.register();

         */

    }
}
