package itp1_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        int input ;
        do {
            input = sc.nextInt();
            if(input != 0) {
                li.add(input);
            }
        } while(input != 0);

        for(int i = 0; i < li.size() ; i++) {
            System.out.println("Case "+(i+1)+": "+li.get(i));
        }
    }
}
