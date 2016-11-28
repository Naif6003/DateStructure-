import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter size of the arry: ");
		int array_size = sc.nextInt();

		
		System.out.print("Enter " + array_size + " numbers: " );
		int[] arr = new int[array_size];
		// add the elements to the array 
		for (int i = 0; i < array_size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("What is the number you want to search for: ");
		int key = sc.nextInt();
		
		// sort the array 
		Arrays.sort(arr);
		
		System.out.print("The array after sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("the number "+ key + " is at index " + theBinarySearch(arr, key));
		
	}
	
	public static int theBinarySearch(int[] arr, int key){
		
		int low = 0;
		int high = arr.length - 1;
		int mid;
		
		// if the low index is lower than the high index of the array
		while(low <= high){
			mid = (low + high) / 2;
			
			// if the key less than the mid element
			if(arr[mid] < key){
				low = mid + 1;
				
			// if the key is higher than the mid element
			}else if(arr[mid] > key){
				high = mid - 1 ;
			
			}else{
				return mid;
			}
		}
		// if we couldn't find the element
		return -1;
	}

}
