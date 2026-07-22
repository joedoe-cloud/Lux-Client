package de.luxclient.event;


/**
 * Event für Rendering.
 *
 * Wird später vom HUD und der GUI verwendet.
 */
public class RenderEvent extends Event {


    private final float tickDelta;



    public RenderEvent(float tickDelta) {

        this.tickDelta = tickDelta;
    }



    public float getTickDelta() {

        return tickDelta;
    }
}
