

import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        int[] elements={8,1,6,4,0,3,9,5};

        
        quicksort(elements,0, elements.length - 1);
        
        for(int i=0;i<elements.length;i++){
            System.out.print(elements[i] + " ");
        }
    }
    
    public static void swap(int[] elements, int i, int j){
        //Method to swap 2 elements in an arraylist
        int temp= elements[i];
        elements[i] =  elements[j];
        elements[j] =  temp;
    }
    
    public static int partition(int[] elements, int beg, int end){
        
        //Get a random pivot between beg and end
        int random= beg + ((int)Math.random()*(elements.length)/(end-beg+1));

        //New position of pivot element
        int last=end;
        
        //Move the pivot element to right edge of the array
        swap(elements, random, end);
        end--;
        
        while(beg<=end){
            if(elements[beg]<elements[last]) beg++; //Accumulate smaller elements to the left
            else {
                swap(elements, beg, end);
                end--;
            }
        }
        
        //Move pivot element to its correct position
        swap(elements, beg, last);
        
        return beg;
    }
    
    public static void quicksort(int[] elements, int beg, int end){
        if(beg>=end) return;
        if(beg<0) return;
        if(end>elements.length-1) return;
        
        int pivot = partition(elements, beg, end);
        quicksort(elements, beg, pivot-1);
        quicksort(elements, pivot+1, end);
    }
}