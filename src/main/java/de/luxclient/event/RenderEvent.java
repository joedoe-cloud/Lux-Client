package de.luxclient.event;


/**
 * Rendering Event.
 *
 * Wird später für:
 *
 * - HUD
 * - ClickGUI
 * - Overlay Rendering
 *
 * verwendet.
 */
public class RenderEvent extends Event {


    private final float tickDelta;



    public RenderEvent(
            float tickDelta
    ) {

        this.tickDelta = tickDelta;
    }



    public float getTickDelta() {

        return tickDelta;
    }
}
