import java.util.Scanner;

public class MergeSort{
	 public static void main(String args[]){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 
		System.out.print("Enter the array size: " );
		int array_size = sc.nextInt();
		
		
		System.out.print("Enter " + array_size + " numbers into the array:");
		int arr[] = new int[array_size];
		for (int i = 0; i < array_size; i++) {
			arr[i] = sc.nextInt();
		}
		
	        System.out.println("Given Array");
	        printArray(arr);
	 
	        // call the sorting array 
	        	sort(arr, 0, arr.length-1);
	 
	        System.out.println("\nSorted array");
	        printArray(arr);
	    }
	public static void sort(int arr[], int l, int r){
	        
		if (l < r){
	            int m = (l+r)/2;
	 
	            sort(arr, l, m);
	            sort(arr , m+1, r);
	 
	            merge(arr, l, m, r);
	        }
	    }
	public static void merge(int arr[], int p, int q, int r)
    {
        
        int n1 = q - p + 1;
        int n2 = r - q;
 
        int L[] = new int [n1];
        int R[] = new int [n2];
 
   
        for (int i=0; i < n1; ++i)
        	 L[i] = arr[p + i];
        
        for (int j=0; j<n2; ++j)
            R[j] = arr[q + 1+ j];
 
 
        int i = 0;
        int j = 0;
 
        int k = p;
        
        
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        
        // instead of the infinity sign
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
	// printing the array 
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}