import java.util.Scanner;

public class PrimesNotExceedingN{
   public static void main (String[] args){		

      String  primeNumbers = "";
      System.out.println("The max number:");
      
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      for (int i = 1; i <= n; i++){ 		 		  		  
    	  int counter = 0; 
    	  for(int num = i; num>=1; num--){
	    
        	 if(i % num == 0){
		counter++;
	    }
	 }
	 if (counter == 2){
	    primeNumbers = primeNumbers + i + " ";}	
      }	
      System.out.println(primeNumbers);

   }
}



