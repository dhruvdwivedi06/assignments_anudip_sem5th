import java.util.*;

//1.wap to print total no of character in a string without using length function.
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;

        for (char ch : str.toCharArray()) {
            count++;
        }

        System.out.println("Total characters = " + count);
    }
}