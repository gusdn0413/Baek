package marathon;

import java.util.Scanner;

public class P1371 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;
        int[] check = new int[26];

        int max = 0;
        int index;

        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            String[] arr = str.split(" ");

            for (String s : arr) {
                for (int i = 0; i < s.length(); i++) {
                    index = s.charAt(i) - 'a';
                    check[index]++;
                    if (check[index] > max) {
                        max = check[index];
                    }
                }
            }
        }

        for (int k = 0; k < 26; k++) {
            if (check[k] == max) {
                System.out.print((char) ('a' + k));
            }
        }
    }
}