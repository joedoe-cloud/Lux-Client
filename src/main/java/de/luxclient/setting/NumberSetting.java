package de.luxclient.setting;


/**
 * Einzelner Zahlenwert.
 *
 * Beispiel:
 *
 * FOV:
 * 90
 */
public class NumberSetting extends Setting<Double> {


    private final double minimum;

    private final double maximum;

    private final double increment;



    public NumberSetting(
            String name,
            double value,
            double minimum,
            double maximum,
            double increment
    ) {

        super(name, value);

        this.minimum = minimum;
        this.maximum = maximum;
        this.increment = increment;
    }



    @Override
    public void setValue(Double value) {


        if (value < minimum) {

            value = minimum;
        }


        if (value > maximum) {

            value = maximum;
        }


        super.setValue(value);
    }



    public double getMinimum() {

        return minimum;
    }


    public double getMaximum() {

        return maximum;
    }


    public double getIncrement() {

        return increment;
    }
}
