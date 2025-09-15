import java.lang.*;
import java.util.*;

class DiffConsecutiveCharacters
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();
        while (T--> 0) {
            int N = scanner.nextInt();
            scanner.nextLine();
            String S = scanner.nextLine();

            int count = 0;

            for (int i = 1; i < N; i++) {
                if (S.charAt(i - 1) == S.charAt(i)) {
                    count++;
                }
            }

            System.out.println(count);
        }
        scanner.close();
    }
}