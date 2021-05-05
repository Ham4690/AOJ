package itp1_3;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        printcDivNum(a, b, c);
    }

    static void printcDivNum(int a, int b, int c) {
        int cnt = 0;
        for(int i = a; i <= b ; i++) {
            if((c % i) == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
