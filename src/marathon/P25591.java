package marathon;

import java.util.Scanner;

public class P25591 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();

        int a = 100 - i1;
        int b = 100 - i2;

        int c = 100 - (a + b);
        int d = a * b;

        int q = d / 100;
        int r = d % 100;

        System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
        System.out.println(c + q + " " + r);
    }
}
