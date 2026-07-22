package de.luxclient.event;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


/**
 * Zentraler Event-Verteiler.
 *
 * Alle Systeme können Events registrieren.
 *
 * Beispiel:
 *
 * Module
 * HUD
 * KeybindManager
 * GUI
 */
public final class EventManager {


    private static final List<Consumer<Event>> LISTENERS =
            new ArrayList<>();



    private EventManager() {

    }



    /**
     * Listener registrieren.
     */
    public static void register(
            Consumer<Event> listener
    ) {

        if (!LISTENERS.contains(listener)) {

            LISTENERS.add(listener);
        }
    }



    /**
     * Listener entfernen.
     */
    public static void unregister(
            Consumer<Event> listener
    ) {

        LISTENERS.remove(listener);
    }



    /**
     * Event senden.
     */
    public static void call(
            Event event
    ) {


        for (Consumer<Event> listener :
                new ArrayList<>(LISTENERS)) {


            listener.accept(event);


            if (event.isCancelled()) {

                break;
            }
        }
    }



    /**
     * Alle Listener entfernen.
     */
    public static void clear() {

        LISTENERS.clear();
    }
}
