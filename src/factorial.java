import java.util.Scanner;

import java.util.Scanner;

public class factorial {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = (f + i-1);
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}






