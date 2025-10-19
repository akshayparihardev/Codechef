import java.util.*;
import java.lang.*;
import java.io.*;

class AddOne
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        while (T--> 0) {
            String N = scanner.nextLine();
            String result = addOne(N);
            System.out.println(result);
        }
    }

    public static String addOne(String N) {
        StringBuilder sb = new StringBuilder(N);

        int carry = 1;

        for (int i = sb.length() - 1; i >= 0; i--) {
            int digit = sb.charAt(i) - '0';
            digit = digit + carry;

            sb.setCharAt(i, (char)((digit % 10) + '0'));
            carry = digit / 10;

            if (carry == 0)
                break;
        }

        if (carry == 1) {
            sb.insert(0, '1');
        }

        return sb.toString();
    }
}