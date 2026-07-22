package de.luxclient.event;


/**
 * Basis-Klasse aller Events.
 *
 * Alle Events im Client erben davon.
 *
 * Beispiele:
 * - TickEvent
 * - RenderEvent
 * - KeyEvent
 */
public abstract class Event {

    private boolean cancelled;


    public boolean isCancelled() {

        return cancelled;
    }


    public void setCancelled(boolean cancelled) {

        this.cancelled = cancelled;
    }
}
