import java.util.Scanner;

public class FirstNPrimes{
   public static void main(String args[])
   {
      int n;
      int yesOrNO = 1;
      int checkTheNumIfPrime = 2;
      
      // to get the number of prime numbers
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n:");
      n = sc.nextInt();

      // the for loop to check if the number is prime then print it otherwise go to the second if
      for ( int i= 1 ; i<= n ;  ){
         for ( int j=2 ; j<= Math.sqrt(checkTheNumIfPrime) ; j++ ){
            if ( checkTheNumIfPrime % j == 0 ){
            	yesOrNO = 0;
               break;
            }
         }
         //if the number is num
         if ( yesOrNO != 0 ){
            System.out.print(checkTheNumIfPrime + " ");
            i++;
         }
         yesOrNO = 1;
         checkTheNumIfPrime++;
      }         
   }
}
