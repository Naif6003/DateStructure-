// import java.util.*;


// public class RadixSort {
    
    
    
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner( System.in );        
//         System.out.println("Radix Sort Test\n");
//         int n, digits;


//         System.out.print("Enter number of integer elements: ");
//         n = scan.nextInt();

        
//         int arr[] = new int[n];

        
//         System.out.print("Please enter number of digits: ");
//          digits = scan.nextInt();

//          int num = 10;
//          for (int i = 1; i < digits - 1; i++) {
//              num = num*10;
//         //  for (int j = digits ; j > i; j--) {
//         //      num *= 10;               
//         //     }
//          }

        
//          Random rnd = new Random();



//         for(int i=0; i < n; i++){
//              arr[i] = rnd.nextInt((num * 10) - num) + num ;
//         }
        
//         sort(arr);
        
//         for (int i = 0; i < n; i++){
//             System.out.print(arr[i]+" ");            
//         System.out.println();   
//         }                  
//     }

//     public static void sort( int[] a){

//         int i, m = a[0], exp = 1, n = a.length;

//         int[] b = new int[10];

//         for (i = 1; i < n; i++)
//             if (a[i] > m)
//                 m = a[i];
//         while (m / exp > 0)
//         {
//             int[] bucket = new int[10];
 
//             for (i = 0; i < n; i++)
//                 bucket[(a[i] / exp) % 10]++;

//             for (i = 1; i < 10; i++)
//                 bucket[i] += bucket[i - 1];
//             for (i = n - 1; i >= 0; i--)
//                 b[--bucket[(a[i] / exp) % 10]] = a[i];
//             for (i = 0; i < n; i++)
//                 a[i] = b[i];
//             exp *= 10;        
//         }
//     }        
// }

import java.util.*;


public class RadixSort {
    
    
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        System.out.println("Radix Sort Test\n");
        int n, digits;


        System.out.print("Enter number of integer elements: ");
        n = scan.nextInt();

        
        int arr[] = new int[n];

        
        System.out.print("Please enter number of digits: ");
         digits = scan.nextInt();

         int num = 10;
         for (int i = 1; i < digits - 1; i++) {
             num = num*10;
        //  for (int j = digits ; j > i; j--) {
        //      num *= 10;               
        //     }
         }

        
         Random rnd = new Random();



        for(int i=0; i < n; i++){
             arr[i] = rnd.nextInt((num * 10) - num) + num ;
        }
        
        sort(arr);
        
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");            
        System.out.println();   
        }                  
    }

    public static void sort( int[] a){

        int i, m = a[0], exp = 1, n = a.length;

        int[] b = new int[a.length];

        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[a.length];
 
            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;

            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;        
        }
    }        
}