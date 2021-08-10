package com.self;

public class Main {

    public static void main(String[] args) {

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value " + minFloatValue);
        System.out.println("Float max value " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value " + minDoubleValue);
        System.out.println("Double max value " + maxDoubleValue);

        int intValue = 5 / 3;
        // the f is casting it as a float, not required to do (float) with this one.
        // the casting is necessary because double is the preferred floating point data type to use, and therefore the default.
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;

        System.out.println("intValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);

        // challenge
        int poundsToConvert = 160;
        double convertedKilograms = poundsToConvert * 0.45359237;

        System.out.println(convertedKilograms);
    }
}
