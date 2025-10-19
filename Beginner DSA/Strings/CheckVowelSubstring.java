import java.util.Scanner;

public class CheckVowelSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            String s = scanner.next();
            boolean isHappy = false;

            for (int i = 2; i < s.length(); i++) {
                char first = s.charAt(i - 2);
                char second = s.charAt(i - 1);
                char third = s.charAt(i);

                if (checkVowel(first) && checkVowel(second) && checkVowel(third)) {
                    isHappy = true;
                    break;
                }
            }

            if (isHappy) {
                System.out.println("Happy");
            } else {
                System.out.println("Sad");
            }
        }
        scanner.close();
    }

    public static boolean checkVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}