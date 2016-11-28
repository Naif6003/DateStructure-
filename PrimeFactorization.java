import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        
    	System.out.print("what's the number: ");
        
    	Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        // how many times we get the same number
        int count;
        
        for (int i = 2; i <= n; i++) {
           
        	count = 0;
           
            while (n % i == 0){
                n = n / i;
                count++;
                if (count == 0) {
                	break;
                }
                
            }
            if(count == 0){

            }
            else{
            	System.out.print( i + "^" + count);
                System.out.print(" * ");
            }
        }
    }
}
