package itp1_3;

import java.util.Scanner;

public class B_swp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int index = 1;
        while((input = sc.nextInt()) != 0) {
            System.out.println("Case "+(index++)+": "+input);
        }
    }
}
