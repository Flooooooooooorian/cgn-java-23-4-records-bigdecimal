package de.neuefische.BigDecimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        double value1 = 0.1;
        double value2 = 0.3;

        System.out.println(value2 / value1);

        BigDecimal value3 = new BigDecimal("0.1");
        BigDecimal value4 = new BigDecimal("0.3");

        System.out.println(value4.divide(value3));
        System.out.println(value4.add(value3));

        System.out.println(value3.divide(value4, 10, RoundingMode.UP));
    }
}
