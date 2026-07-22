package de.luxclient.event;


/**
 * Tastatur Event.
 *
 * Wird vom KeybindManager verarbeitet.
 */
public class KeyEvent extends Event {


    private final int key;



    public KeyEvent(
            int key
    ) {

        this.key = key;
    }



    public int getKey() {

        return key;
    }
}
