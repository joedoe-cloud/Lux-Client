package de.luxclient.event;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


/**
 * Einfacher Event-Verteiler.
 *
 * Verteilt Events an registrierte Listener.
 */
public final class EventManager {


    private static final List<Consumer<Event>> LISTENERS =
            new ArrayList<>();


    private EventManager() {

    }



    public static void register(
            Consumer<Event> listener
    ) {

        LISTENERS.add(listener);
    }



    public static void unregister(
            Consumer<Event> listener
    ) {

        LISTENERS.remove(listener);
    }



    public static void call(Event event) {


        for (Consumer<Event> listener : LISTENERS) {

            listener.accept(event);
        }
    }
}
