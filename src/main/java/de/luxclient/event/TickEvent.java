package de.luxclient.event;


/**
 * Wird regelmäßig während des Minecraft-Ticks ausgelöst.
 *
 * 20 Ticks pro Sekunde.
 */
public class TickEvent extends Event {


    public enum Stage {

        PRE,
        POST
    }


    private final Stage stage;



    public TickEvent(Stage stage) {

        this.stage = stage;
    }



    public Stage getStage() {

        return stage;
    }
}
