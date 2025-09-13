import java.util.Scanner;
public class Running_Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (b[i] <= 2 * a[i] && a[i] <= 2 * b[i]) {
                    count++;
                }
            }
            
            // Print count only once per test case
            System.out.println(count);
            
            t--;
        }
        scanner.close();
    }
}
