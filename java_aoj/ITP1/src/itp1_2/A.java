package itp1_2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        compTwoValue(a, b);
    }

    static void compTwoValue(int a, int b) {
        if(a > b) {
            System.out.println("a > b");
        } else if(a < b) {
            System.out.println("a < b");
        }else{
            System.out.println("a == b");
        }
    }
}
