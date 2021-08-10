package com.self;

public class Main {

    public static void main(String[] args) {

        int value = 10000;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + minIntValue);
        System.out.println("Integer maximum value = " + maxIntValue);
        // this is an example of overflow:
        System.out.println("BUSTED max value = " + (maxIntValue + 1));
        // this is an example of underflow:
        System.out.println("BUSTED min value = " + (minIntValue - 1));

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value = " + minByteValue);
        System.out.println("Byte max value = " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value = " + minShortValue);
        System.out.println("Short max value = " + maxShortValue);

        long myLongValue = 100;
        // this is too big for an int so the L is required to denote "long" to java
        long bigLongLiteralValue = 2147483647234L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value = " + minLongValue);
        System.out.println("Long max value = " + maxLongValue);


        int myTotal = (minIntValue / 2);
        // cast into byte, because it interprets this by default as an int otherwise and rejects it
        byte newByteValue = (byte) (minByteValue / 2);
        short newShortValue = (short) (minShortValue / 2);


        byte myByteVar = 10;
        short myShortVar = 1684;
        int myIntVar = 2039535;
        long longTotal = 50000L + 10L * (myByteVar + myShortVar + myIntVar);

        System.out.println(longTotal);
    }
}
