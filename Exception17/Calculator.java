package Exception17;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num >= 0) {
            for (int i = 0; i < num; i++) {
                int n = scanner.nextInt();
                int p = scanner.nextInt();
                if (n >= 0 && p >= 0) {
                    int result = (int) Math.pow(n, p);
                    System.out.println(result);
                } else {

                    System.out.println("n and p should be non-negative.");

                }
            }

        }

    }
}
