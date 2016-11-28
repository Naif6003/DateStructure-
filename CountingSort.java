// // import java.util.*;

// // public class CountingSort{

// // public static void main(String[] args){


// //     Scanner sc = new Scanner(System.in);

// //     System.out.print("Please enter upper bound: ");
// //     int bound = sc.nextInt();

// //     System.out.print("Please enter max elements in the array: ");
// //     int numberOfElements = sc.nextInt();

// //     int[] arr = new int[numberOfElements];


// // Random rnd = new Random();

// //     for(int i=0; i < numberOfElements; i++){
// //         arr[i] = rnd.nextInt(numberOfElements);
// //     }

// //     theCountingSort(arr,arr.length,bound);

// // for(int i=0; i< arr.length; i++){
// //         System.out.print(arr[i] + " ");
// // }

// // }

// // static int[] theCountingSort(int[] arr, int numberOfElements, int bound){


// //         int c[] = new int[bound];

// //         for (int i = 0; i < bound; i++){
// //             c[i] = 0;}

// //              for (int j = 1; j < numberOfElements ; j++){
// //                 c[arr[j]] = c[arr[j]]+1;}

// //                 for (int i = 1; i <= bound;i++){
// //                     c[i] = c[i] + c[i-1];}

// //         int b[] = new int[numberOfElements];

// //                      for (int j = numberOfElements; j >= 0; j--){
// //                            b[c[arr[j]]] = arr[j];
// //                             c[arr[j]] = c[arr[j]] - 1;
// //                      }
// //         return b;
// // }

// // }

// import java.util.*;

// public class CountingSort {

//     private static final int MAX_RANGE = 1000000;


//     public static void sort( int[] arr , int n , int bound){


//         int max = bound, min = 0;

//         int[] count = new int[n];


//         for (int i = 0; i < n; i++)
//             count[arr[i] - min]++;

//         for (int i = 1; i < bound; i++)
//             count[i] += count[i - 1];
//         //             c[i] = 0;}

// //              for (int j = 1; j < numberOfElements ; j++){
// //                 c[arr[j]] = c[arr[j]]+1;}

// //                 for (int i = 1; i <= bound;i++){
// //                     c[i] = c[i] + c[i-1];}



//         int j = 0;
//         for (int i = 0; i < bound; i++)
//             while (j < count[i])
//                 arr[j++] = i + min;
//     }    

//     public static void main(String[] args) {
//         Scanner scan = new Scanner( System.in );        
//         int n, bound;


//         System.out.print("Enter number of integer elements : ");
//         n = scan.nextInt();
//         int arr[] = new int[ n ];


//         System.out.print("Please enter highest elements in the array: ");
//          bound = scan.nextInt();


//          Random rnd = new Random();

//         for(int i=0; i < n; i++){
//              arr[i] = rnd.nextInt(bound);
//     }


//         sort(arr,n,bound);

//         System.out.println("Elements after sorting ");        
       
//         for (int i = 0; i < n; i++){
//             System.out.print(arr[i]+ " ");                               
//     }    
// }
// }

import java.util.*;

public class CountingSort {

    private static final int MAX_RANGE = 1000000;


    public static void sort( int[] arr , int n , int bound){


        int max = bound, min = 0;

        int[] count = new int[n];


        for (int i = 0; i < n; i++)
            count[arr[i] - min]++;

        for (int i = 1; i < bound; i++)
            count[i] += count[i - 1];
        //             c[i] = 0;}

//              for (int j = 1; j < numberOfElements ; j++){
//                 c[arr[j]] = c[arr[j]]+1;}

//                 for (int i = 1; i <= bound;i++){
//                     c[i] = c[i] + c[i-1];}



        int j = 0;
        for (int i = 0; i < bound; i++)
            while (j < count[i])
                arr[j++] = i + min;
    }    

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );        
        int n, bound;


        System.out.print("Enter number of integer elements : ");
        n = scan.nextInt();
        int arr[] = new int[ n ];


        System.out.print("Please enter highest elements in the array: ");
         bound = scan.nextInt();


         Random rnd = new Random();

         //     for(int j= p; j < r-1 ; j++ ){
//     //         if (arr[j] < arr[pivot]){
//     //             i = i + 1;
//     //             exchange(arr,i,j);
//     //         }
//     //         exchange(arr, i+1 , r);
//     //     }
//     //     return i+1;
        
        for(int i=0; i < n; i++){
             arr[i] = rnd.nextInt(bound);
    }


        sort(arr,n,bound);

        System.out.println("Elements after sorting ");        
       
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");                               
    }    
}
}