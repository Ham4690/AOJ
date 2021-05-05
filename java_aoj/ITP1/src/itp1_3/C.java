package itp1_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        int x;
        int y;

        while(true) {
            int[] inputs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(inputs[0] == 0 && inputs[1] == 0 ) {
                break;
            }
            printSortAsc(inputs[0], inputs[1]);
        }
    }

    static void printSortAsc(int x, int y) {
        if(x < y) {
            System.out.println(x + " " + y);
        }else{
            System.out.println(y + " " + x);
        }
    }
}
