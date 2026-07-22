package de.luxclient.setting;


/**
 * Wertebereich mit zwei Punkten.
 *
 * Standard für:
 *
 * CPS
 * Delay
 * Timer
 */
public class RangeSetting
        extends Setting<double[]> {


    private final double minimum;

    private final double maximum;

    private final double increment;



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
                new double[]{
                        minValue,
                        maxValue
                }
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



    public void setMinValue(
            double value
    ) {


        double[] range =
                getValue();


        range[0] =
                clamp(value);


        if(range[0] > range[1]) {

            range[0] = range[1];
        }
    }



    public void setMaxValue(
            double value
    ) {


        double[] range =
                getValue();


        range[1] =
                clamp(value);


        if(range[1] < range[0]) {

            range[1] = range[0];
        }
    }



    private double clamp(
            double value
    ) {

        value =
                Math.max(
                        minimum,
                        Math.min(
                                maximum,
                                value
                        )
                );


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
