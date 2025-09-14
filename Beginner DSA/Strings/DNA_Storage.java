import java.util.Scanner;

public class DNA_Storage {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            StringBuilder str = new StringBuilder();
            
            
            for (int i = 0 ; i < n ; i = i+2){
                String pair = s.substring(i,i+2);
                
                if (pair.equals("00")){
                    str.append('A');
                }
                else if(pair.equals("01")){
                    str.append('T');
                }
                else if(pair.equals("10")){
                    str.append('C');
                }
                else if(pair.equals("11")){
                    str.append('G');
                }
            }
            System.out.println(str.toString());
        }
        scanner.close();
    }  
}
