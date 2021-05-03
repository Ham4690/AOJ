package itp1_2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();

        li.add(sc.nextInt());
        li.add(sc.nextInt());
        li.add(sc.nextInt());

        li.sort(Integer::compare);

        for(int i = 0 ; i < li.size()-1 ; i++) {
            System.out.print(li.get(i)+" ");
        }
        System.out.println(li.get(li.size()-1));
    }
}
