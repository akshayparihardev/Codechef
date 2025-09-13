import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        while (T > 0) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            int Total_cost = 0;
            
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            
            for (int j = 0; j < N; j++) {
                B[j] = scanner.nextInt();
            }
            
            for (int i = 0 ; i < N ; i++){
                if(A[i] >= X){
                    Total_cost = Total_cost + B[i];
                }
            }
            System.out.println(Total_cost);
        
            T--;    
        }
        scanner.close();
    }
}
