package de.luxclient.setting;


/**
 * Einzelner Zahlenwert.
 *
 * Beispiel:
 *
 * FOV
 * Reichweite
 * Geschwindigkeit
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


        setValue(value);
    }



    @Override
    public void setValue(
            Double value
    ) {


        if (value == null) {

            return;
        }


        value = clamp(value);


        super.setValue(
                round(value)
        );
    }



    private double clamp(
            double value
    ) {

        return Math.max(
                minimum,
                Math.min(
                        maximum,
                        value
                )
        );
    }



    private double round(
            double value
    ) {

        double steps =
                Math.round(
                        value / increment
                );


        return steps * increment;
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
