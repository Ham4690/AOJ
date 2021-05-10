package itp1_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D {

    private static final int BIG_NUM = 2000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        int min = BIG_NUM;
        int max = -BIG_NUM;
        long sum = 0;


        int N = Integer.parseInt(sc.nextLine());

        String[] inputNums = sc.nextLine().split(" ");
        for( String num : inputNums ) {
            li.add(Integer.parseInt(num));

        }

        min = li.stream().mapToInt(Integer::intValue).min().getAsInt();
        max = li.stream().mapToInt(Integer::intValue).max().getAsInt();
        sum = li.stream().mapToLong(Long::valueOf).sum();
        System.out.println(min + " " + max + " " + sum );
    }
}
