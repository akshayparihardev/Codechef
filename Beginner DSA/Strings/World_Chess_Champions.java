import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
    
        int t = scanner.nextInt();
        
        while (t--> 0) {

            int X = scanner.nextInt();

            String S = scanner.next();

            StringBuilder str = new StringBuilder();

            int Carlsen_points = 0;
            int Chef_points = 0;

            for (int i = 0 ; i < S.length(); i++) {
                if (S.charAt(i) == 'C') {
                    Carlsen_points = Carlsen_points + 2;
                } else if (S.charAt(i) == 'N') {
                    Chef_points = Chef_points + 2;
                } else if (S.charAt(i) == 'D') {
                    Carlsen_points++;
                    Chef_points++;
                }
            }

            if (Carlsen_points > Chef_points) {
                System.out.println(60 * X);
            } else if (Chef_points > Carlsen_points) {
                System.out.println(40 * X);
            } else if (Carlsen_points == Chef_points){
                System.out.println(55 * X);
            }
        }

    }
}