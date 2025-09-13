import java.util.Scanner;

public class Largest_SecondLargest_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            int largest = -1;
            int secondlargest = -1;
            
            for (int i = 0 ; i < n ; i++){
                if (a[i] > largest){
                    secondlargest = largest;
                    largest = a[i];
                }
                else if (a[i] > secondlargest && a[i] != largest){
                    secondlargest = a[i];
                } 
            }
            
            System.out.println(largest + secondlargest);
        }
        scanner.close();
    }
}
