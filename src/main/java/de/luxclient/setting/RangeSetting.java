package de.luxclient.setting;


/**
 * Bereichs-Setting mit zwei Werten.
 *
 * Wird später für den RangeSlider benutzt.
 *
 * Beispiele:
 *
 * CPS:
 * 8 - 12
 *
 * Delay:
 * 50ms - 200ms
 *
 * Timer:
 * 0.9 - 1.1
 */
public class RangeSetting extends Setting<double[]> {


    private final double minimum;

    private final double maximum;

    private final double increment;



    public RangeSetting(
            String name,
            double minValue,
            double maxValue,
            double minimum,
            double maximum
    ) {

        super(
                name,
                new double[]{minValue, maxValue}
        );


        this.minimum = minimum;
        this.maximum = maximum;
        this.increment = 1.0;
    }



    public RangeSetting(
            String name,
            double minValue,
            double maxValue,
            double minimum,
            double maximum,
            double increment
    ) {

        super(
                name,
                new double[]{minValue, maxValue}
        );


        this.minimum = minimum;
        this.maximum = maximum;
        this.increment = increment;
    }



    public double getMinValue() {

        return getValue()[0];
    }



    public double getMaxValue() {

        return getValue()[1];
    }



    public void setMinValue(double value) {

        double[] range = getValue();

        range[0] = clamp(value);

        if (range[0] > range[1]) {

            range[0] = range[1];
        }
    }



    public void setMaxValue(double value) {

        double[] range = getValue();

        range[1] = clamp(value);

        if (range[1] < range[0]) {

            range[1] = range[0];
        }
    }



    private double clamp(double value) {

        if (value < minimum) {

            return minimum;
        }


        if (value > maximum) {

            return maximum;
        }


        return value;
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
