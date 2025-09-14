import java.util.Scanner;

public class Difficulty_Rating_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }

            boolean isNonDecreasing = true; 

            for (int i = 1; i < n; i++) {
                if (d[i - 1] > d[i]) { 
                    isNonDecreasing = false;
                    break;
                }
            }

            if (isNonDecreasing) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }
}
