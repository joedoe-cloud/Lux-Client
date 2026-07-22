package de.luxclient.event;


/**
 * Basis aller Lux Client Events.
 *
 * Events können:
 *
 * - Tick
 * - Render
 * - Key Input
 * - weitere Client Events
 *
 * darstellen.
 */
public abstract class Event {


    private boolean cancelled;



    /**
     * Prüft, ob Event blockiert wurde.
     */
    public boolean isCancelled() {

        return cancelled;
    }



    /**
     * Setzt Cancel Status.
     */
    public void setCancelled(
            boolean cancelled
    ) {

        this.cancelled = cancelled;
    }
}
