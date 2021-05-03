package itp1_2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        compThreeValue(a,b,c);
    }

    static void compThreeValue(int a, int b, int c) {
        if( a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
