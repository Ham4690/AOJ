package itp1_2;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        int W, H, x, y, r;
        Scanner sc = new Scanner(System.in);
        W = sc.nextInt();
        H = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        r = sc.nextInt();

        isCircleInTheBox(W, H, x, y, r);
    }

    static void isCircleInTheBox(int W, int H, int x, int y, int r) {
        int circleLeftEnd = x - r;
        int circleRightEnd = x + r;
        int circleTop = y + r;
        int circleBottom = y - r;

        if(  0 <= circleLeftEnd
                && circleRightEnd <= W
                && 0 <= circleBottom
                && circleTop <= H
        ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
