package itp1_5;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(true) {
            int x = i;
            if(x % 3 == 0) {
                System.out.print(" " + i);

            }else if( x % 10 == 3) {
                System.out.print(" " + i);
            }else {
                while(x>0){
                    x /= 10;
                    if( x % 10 == 3 ) {
                        System.out.print(" " + i);
                        break;
                    }
                }
            }

            if(++i > n){
                break;
            }
        }
        System.out.println();
    }
}
