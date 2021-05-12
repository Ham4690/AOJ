package itp1_5;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, w;
        String[] line;

        while(true) {
            line = sc.nextLine().split(" ");
            h = Integer.parseInt(line[0]);
            w = Integer.parseInt(line[1]);
            if(h == 0 && w == 0) {
                break;
            }
            printSquare(h, w);
        }
    }

    static void printSquare(int h, int w) {
        for(int i = 0 ; i < h ; i++) {
            for(int j = 0 ; j < w ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }
}
