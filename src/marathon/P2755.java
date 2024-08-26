package marathon;

import java.util.Scanner;

public class P2755 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[][] arr = new String[n][3];

        double sum = 0;
        double gradeSum = 0;

        for (int i = 0; i < n; i++) {
            double temp = 0;

            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.next();
            }
            String score = arr[i][2];

            if (score.charAt(0) == 'A') temp = 4;
            else if (score.charAt(0) == 'B') temp = 3;
            else if (score.charAt(0) == 'C') temp = 2;
            else if (score.charAt(0) == 'D') temp = 1;
            else if (score.charAt(0) == 'F') temp = 0;

            if (score.length() > 1) {
                if (score.charAt(1) == '+') temp += 0.3;
                else if (score.charAt(1) == '-') temp -= 0.3;
            }

            int credits = Integer.parseInt(arr[i][1]);
            sum += credits * temp;
            gradeSum += credits;
        }

        if (gradeSum > 0) {
            System.out.printf("%.2f%n", sum / gradeSum);
        } else {
            System.out.println("0.00");
        }
    }
}
