package itp1_5;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line;
        int h, w;

        while(true) {
            line = sc.nextLine().split(" ");
            h = Integer.parseInt(line[0]);
            w = Integer.parseInt(line[1]);
            if(h == 0 && w == 0) {
                break;
            }
            printBox(h, w);
        }

    }

    static void printBox(int h, int w) {
        for(int i = 0 ; i < w ; i++){
            System.out.print("#");
        }
        System.out.println();
        for(int i=1 ; i < h-1 ; i++) {
            System.out.printf("#");
            for(int j=1 ; j < w-1 ; j++) {
                System.out.printf(".");
            }
            System.out.println("#");
        }
        for(int i = 0 ; i < w ; i++){
            System.out.print("#");
        }
        System.out.println();
        System.out.println();
    }
}
