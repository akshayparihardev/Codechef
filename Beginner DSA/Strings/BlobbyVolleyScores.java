import java.util.Scanner;

public class BlobbyVolleyScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            int alice_points = 0;
            int bob_points = 0;
            char server = 'A'; 

            for (int i = 0; i < s.length(); i++) {
                char winner = s.charAt(i);

                if (winner == server) {
                    if (server == 'A') {
                        alice_points++;
                    } else {
                        bob_points++;
                    }
                } else {
                    server = winner;
                }
            }

            System.out.println(alice_points + " " + bob_points);
        }
        scanner.close();
    }
}