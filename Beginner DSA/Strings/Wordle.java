import java.util.*;
import java.lang.*;
import java.io.*;

class Wordle
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t--> 0) {

            String S = scanner.next();

            String T = scanner.next();

            StringBuilder M = new StringBuilder();

            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == T.charAt(i)) {
                    M.append("G");
                }
                else {
                    M.append("B");
                }
            }
            System.out.println(M);
        }
        scanner.close();
    }
}