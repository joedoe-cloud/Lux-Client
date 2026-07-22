package de.luxclient.event;


/**
 * Wird während des Minecraft Tick-Zyklus ausgelöst.
 *
 * Minecraft läuft standardmäßig mit 20 TPS.
 */
public class TickEvent extends Event {


    public enum Stage {

        PRE,

        POST
    }



    private final Stage stage;



    public TickEvent(
            Stage stage
    ) {

        this.stage = stage;
    }



    public Stage getStage() {

        return stage;
    }
}
