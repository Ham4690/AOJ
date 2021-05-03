package itp1_1;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();

        printTime(sec);
    }

    static void printTime(int sec) {
        int h = sec / 3600;
        sec %= 3600;
        int m = sec / 60;
        sec %= 60;
        int s = sec;
        System.out.println(h+":"+m+":"+s);
    }
}
