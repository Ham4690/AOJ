package itp1_1;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        int squareArea = calcSquareArea(a, b);
        int squareAround = calcSquareAround(a, b);
        System.out.println(squareArea + " " + squareAround);

    }

    static int calcSquareAround(int a, int b) {
        return a * 2 + b * 2;
    }

    static int calcSquareArea(int a, int b) {
        return a * b;
    }
}
