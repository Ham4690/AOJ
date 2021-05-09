package itp1_4;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line;
        int x;
        int y;
        String op;

        while(true) {
            line = sc.nextLine().split(" ");
            x = Integer.parseInt(line[0]);
            op = line[1];
            y = Integer.parseInt(line[2]);
            if(op.equals("?")) {
                break;
            }
            calc(x, op , y);
        }
    }

    static void calc(int x, String op, int y) {
        switch (op) {
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                System.out.println(x/y);
                break;
        }
    }
}

