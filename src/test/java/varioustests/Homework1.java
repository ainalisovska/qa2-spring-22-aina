package varioustests;

import org.junit.jupiter.api.Test;

public class Homework1 {
    public double calculateFuel (double a, double b) {
        return a*b/100;
            }

            @Test
            public void test() {
        double a = calculateFuel(5, 60);
        System.out.println(a);
            }
}



