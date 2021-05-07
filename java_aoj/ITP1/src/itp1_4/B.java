package itp1_4;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double circleArea = getCircleAround(r);
        double circleAround = getCircleArea(r);

        System.out.printf("%f %f%n", circleArea, circleAround);
    }

    static double getCircleAround(Double r) {
        return r * r * Math.PI;
    }

    static double getCircleArea(Double r) {
        return 2 * r * Math.PI;
    }
}
