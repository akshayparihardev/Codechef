import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0 ; i < T ; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            int[] arr = new int[N];
            int cost_Without_Coupon = 0;
            int discounted_Price = 0;
            
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                cost_Without_Coupon = cost_Without_Coupon + arr[j];
                
                int new_Price = arr[j] - Y;
                
                if (new_Price < 0)
                    new_Price = 0;
                discounted_Price = discounted_Price + new_Price;
            }
            
            long cost_With_Coupon = X + discounted_Price;
            
            if (cost_With_Coupon < cost_Without_Coupon)
                System.out.println("COUPON");
            else
                System.out.println("NO COUPON");
            
        }
        sc.close();
    }
}
