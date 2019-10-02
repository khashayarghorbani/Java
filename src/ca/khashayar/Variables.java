package ca.khashayar;

import java.math.BigDecimal;

public class Variables {
    public static int intVal;
    public static void variables() {
        System.out.println(intVal);
        // different variables
        // byte short int long
        byte byteNumber = Byte.MAX_VALUE;
        short shortNumber = Short.MAX_VALUE;
        int intNumberMin = Integer.MIN_VALUE;
        int intNumberMax = Integer.MAX_VALUE;
        byte ByteNumbers = 60;
        byte otherByte = (byte) (ByteNumbers / 2);
        System.out.println("maximum number of integer is " + intNumberMax);
        System.out.println("minimum number of integer is " + intNumberMin);
        System.out.println("Byte number is " + byteNumber);
        System.out.println("Short number is " + shortNumber);
        System.out.println(otherByte);
        long longValue = Long.MAX_VALUE;
        System.out.println("long value is= " + longValue);

        double cofeePrice = 2.75d;// d is optional but better to use it
        float teaPrice = 2.99f; // f is a must

        int coffee = (int) cofeePrice;
        System.out.println("the int coffee price is : " + coffee); // 2
        System.out.println("the rounded tea price is : " + Math.round(teaPrice)); // 3
        System.out.println("the floor tea price is " + Math.floor(teaPrice)); //2.0
        double q = 25d / 2;
        System.out.println(q);
        System.out.println("(double)25d / 2 = " + (double) 25 / 2);
        System.out.println("25d / 2 = " + 25d / 2);
        System.out.println("25f / 2 = " + 25f / 2);
        System.out.println("(int)(25f / 2) = " + (int) (25f / 2));
        int test = (int) Math.pow(2, 32);
        System.out.println(test);
        double dVal = .012;
        double sum = dVal + dVal + dVal;
        System.out.println("wrong calculation = " + sum);
        System.out.format("%.3f" , sum);
        BigDecimal bigValue = new BigDecimal(Double.toString(dVal));
        BigDecimal total = bigValue.add(bigValue).add(bigValue);
        System.out.println("The right calculation = " + total);

        //boolean

        boolean isLightsOn = true;
        boolean AmINotSleeping = !isLightsOn;
        System.out.println("is lights on? " + isLightsOn);
        System.out.println("am I sleeping? " + AmINotSleeping);

        //char

        char Initial1 = 'S';
        char Initial2 = '\u0298'; //unicode initials
        System.out.println("Initial1 = " + Initial1);
        System.out.println("Initial2 = " + Initial2);


        //String

        String khash = "Khashayar is smart";
        System.out.println(khash + "\n"); // "\n" is for adding a line

    }
}