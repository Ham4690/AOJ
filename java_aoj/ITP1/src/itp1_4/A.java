package itp1_4;


import java.math.BigDecimal;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        int d, r;
        BigDecimal f;

        x = sc.nextInt();
        y = sc.nextInt();

        BigDecimal xD = new BigDecimal(x);
        BigDecimal yD = new BigDecimal(y);

        d = x / y;
        r = x % y;
        f = xD.divide(yD, 5, BigDecimal.ROUND_HALF_UP);
        System.out.println(d + " " + r + " " + f);

    }
}
