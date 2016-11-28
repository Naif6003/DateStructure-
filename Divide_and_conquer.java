import java.util.Scanner;

public class Divide_and_conquer {

	public static int a, n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter two numbers:");
		
		System.out.print("Num1: ");
		a = sc.nextInt();
		
		System.out.print("Num2: ");
		 n = sc.nextInt();

		System.out.println( powerMethod(a, n));

	}
	// recursively divide and conquer
	public static int powerMethod(int a, int n){
	
		if( n == 0)
			return 1;
		
		else if (n % 2 == 0)
			return powerMethod(a, n/2) * powerMethod(a, n/2);
		else
			return a * powerMethod(a, (n - 1)/2) * powerMethod(a,(n-1)/2);

	}

}
