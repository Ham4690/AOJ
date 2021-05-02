import java.util.Scanner;

public class ITP1_1_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(calc(num));
    }

    static int calc(int num) {
        return num * num * num;
    }
}
