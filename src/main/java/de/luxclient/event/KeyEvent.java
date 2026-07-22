package de.luxclient.event;


/**
 * Event für Tastendrücke.
 *
 * Wird später vom KeybindManager benutzt.
 */
public class KeyEvent extends Event {


    private final int key;



    public KeyEvent(int key) {

        this.key = key;
    }



    public int getKey() {

        return key;
    }
}
