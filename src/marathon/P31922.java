package marathon;

import java.util.Scanner;

public class P31922 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int P = scanner.nextInt();
        int C = scanner.nextInt();

        if ((A + C) < P) {
            System.out.println(P);
        } else {
            System.out.println(A + C);
        }
    }
}
