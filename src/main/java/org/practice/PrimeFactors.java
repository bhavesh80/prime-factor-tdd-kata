package org.practice;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> factorsOf(int number) {
        List<Integer> factors = new ArrayList<>();
        int divisor = 2;

        while (number > 1) {
            while (number % divisor == 0) {
                factors.add(divisor);
                number /= divisor;
            }
            divisor++;
        }
        return factors;
    }
}
