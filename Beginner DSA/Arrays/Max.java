import java.lang.*;
import java.util.*;

class Max
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

        for (int t = 0 ; t < T ; t++){
            
            int N = sc.nextInt();
            int arr[] = new int[N];
            int max = 0;
            
            for (int i = 0 ; i < N ; i++){
                arr[i] = sc.nextInt();
                if (arr[i] > max){
                    max = arr[i];    
                }
            }
        
        System.out.println(max);    
        }
	}
}
