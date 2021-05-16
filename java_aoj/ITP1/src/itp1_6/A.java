package itp1_6;

import java.util.Scanner;
import java.util.Stack;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(sc.nextLine());
        String[] line = sc.nextLine().split(" ");

        for(String num : line ){
            st.push(Integer.parseInt(num));
        }

        for(int i = 0 ; i < n-1; i++){
            System.out.print(st.pop() + " ");
        }
        System.out.println(st.pop());

    }
}
