package HomeWork6;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MainClass extends Application{
	
	public static double[] list;
	
	public static void main(String[] args){
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		BorderPane border = new BorderPane();
		
		// the sorting algorithms 
		HBox topBox = addTopBox();
		topBox.setTranslateX(130);
		border.setTop(topBox);
		
		// adding the values to be tested 
		BorderPane leftBox;
		leftBox = addLBox();
		border.setCenter(leftBox);
		
		
		
		Scene scene = new Scene(border,700,300);
		primaryStage.setTitle("Sorting Algorithms");
		primaryStage.setScene(scene);
		primaryStage.show();
	}


//	private VBox addCenterVBox(Text txt) {
//		
//		VBox vbox = new VBox();
//		
//		//if button 1 clicked, all these values for sorting method 
//		
//			vbox.getChildren().add(txt);
//		
//		return vbox;
//	}

	private HBox addTopBox() {
		HBox hbox = new HBox();
		
		Label label1 = new Label("Selection Sort");
		label1.setPadding(new Insets(0, 10, 0,10));
		Label label2 = new Label("Insertion Sort");
		label2.setPadding(new Insets(0, 10, 0,10));
		Label label3 = new Label("Bubble Sort");
		label3.setPadding(new Insets(0, 10, 0,10));
		Label label4 = new Label("Merge Sort");
		label4.setPadding(new Insets(0, 10, 0,10));
		Label label5 = new Label("Quick Sort");
		label5.setPadding(new Insets(0, 10, 0,10));
		Label label6 = new Label("Heap Sort");
		label6.setPadding(new Insets(0, 10, 0,10));
		
		
		hbox.getChildren().addAll(label1,label2,label3,label4,label5,label6);
		
		return hbox;
	}

	private BorderPane addLBox() {
		
		BorderPane border = new BorderPane();
		VBox vboxButton = new VBox();
		
		
		
		Button button1 = new Button("50000");
		button1.setPrefSize(100, 50);

		
		button1.setOnAction(e -> {
			
			int n = 50000;
			
			 list = new double[n];
			for (int i = 0; i < 100; i++) {
			    list[i] =  (Math.random() * 10);
			}// end for			
			
			// call selection sort from the inner class.
			Sorting sort = new Sorting();
			
				// the execution time of selection method
				String theStringSelection = String.valueOf(sort.selectionSort(list));
				Label label = new Label(theStringSelection);
				label.setPadding(new Insets(15, 66, 50, 66));
				
				// the execution time from Insertion method
				String theStringInsertion = String.valueOf(sort.insertionSort(list));
				Label label1 = new Label(theStringInsertion);
				label1.setPadding(new Insets(15, 66, 50, 20));
				
				// the execution time from Bubble method
				String theStringBubble = String.valueOf(sort.bubble_srt(list));
				Label label2 = new Label(theStringBubble);
				label2.setPadding(new Insets(15, 66, 50, 10));
				
				// the execution time from Merge method
//				String theStringMerge = String.valueOf(sort.mergeSort(list));
//				Label label3 = new Label(theStringMerge);
//				label3.setPadding(new Insets(15, 66, 50, 66));
			
				
				// the execution time from Quick method
				int low = 0;
				int high = list.length - 1 ;
				String theStringQuick = String.valueOf(sort.quickSort(low,high));
				Label label4 = new Label(theStringQuick);
				label4.setPadding(new Insets(15, 66, 50, 10));
				
				// the execution time from Heap method
				String theStringHeap = String.valueOf(sort.sortTheHeap(list));
				Label label5 = new Label(theStringHeap);
				label5.setPadding(new Insets(15, 66, 50, 10));
			
				HBox hBoxValue = new HBox();
			hBoxValue.getChildren().addAll(label,label1,label2,label4,label5);
			border.setCenter(hBoxValue);
			
		});
		
		
		
		
		Button button2 = new Button("100000");
		button2.setPrefSize(100, 50);
		button2.setOnAction(e -> {
			
			int n = 100000;
			
			 list = new double[n];
			for (int i = 0; i < 100; i++) {
			    list[i] =  (Math.random() * 10);
			}// end for			
			
			// call selection sort from the inner class.
			Sorting sort = new Sorting();
			
						// the execution time of selection method
						String theStringSelection = String.valueOf(sort.selectionSort(list));
						Label label = new Label(theStringSelection);
						label.setPadding(new Insets(15, 66, 50, 66));
						
						// the execution time from Insertion method
						String theStringInsertion = String.valueOf(sort.insertionSort(list));
						Label label1 = new Label(theStringInsertion);
						label1.setPadding(new Insets(15, 66, 50, 20));
						
						// the execution time from Bubble method
						String theStringBubble = String.valueOf(sort.bubble_srt(list));
						Label label2 = new Label(theStringBubble);
						label2.setPadding(new Insets(15, 66, 50, 10));
						
						// the execution time from Merge method
//						String theStringMerge = String.valueOf(sort.mergeSort(list));
//						Label label3 = new Label(theStringMerge);
//						label3.setPadding(new Insets(15, 66, 50, 66));
//					
						// the execution time from Quick method
						int low = 0;
						int high = list.length - 1;
						String theStringQuick = String.valueOf(sort.quickSort( low , high));
						Label label4 = new Label(theStringQuick);
						label4.setPadding(new Insets(15, 66, 50, 10));
						
						// the execution time from Heap method
						String theStringHeap = String.valueOf(sort.sortTheHeap(list));
						Label label5 = new Label(theStringHeap);
						label5.setPadding(new Insets(15, 66, 50, 10));
						
						
						HBox hBoxValue1 = new HBox();
						hBoxValue1.getChildren().addAll(label,label1,label2,label5);
						
						border.setCenter(hBoxValue1);
		});
		
		Button button3 = new Button("150000");
		button3.setPrefSize(100, 50);
		
		button3.setOnAction(e -> {
			
			int n = 50000;
			 list = new double[n];
			for (int i = 0; i < 100; i++) {
			    list[i] =  (Math.random() * 10);
			}// end for			
			
			// call selection sort from the inner class.
			Sorting sort = new Sorting();
			
						// the execution time of selection method
						String theStringSelection = String.valueOf(sort.selectionSort(list));
						Label label = new Label(theStringSelection);
						label.setPadding(new Insets(15, 66, 50, 66));
						
						// the execution time from Insertion method
						String theStringInsertion = String.valueOf(sort.insertionSort(list));
						Label label1 = new Label(theStringInsertion);
						label1.setPadding(new Insets(15, 66, 50, 20));
						
						// the execution time from Bubble method
						String theStringBubble = String.valueOf(sort.bubble_srt(list));
						Label label2 = new Label(theStringBubble);
						label2.setPadding(new Insets(15, 66, 50, 10));
						
						// the execution time from Merge method
//						String theStringMerge = String.valueOf(sort.mergeSort(list));
//						Label label3 = new Label(theStringMerge);
//						label3.setPadding(new Insets(15, 66, 50, 66));
//					
						// the execution time from Quick method
//						int low = 0;
//						int high = list.length - 1;
//						String theStringQuick = String.valueOf(sort.quickSort(list, low , high));
//						Label label4 = new Label(theStringQuick);
//						label4.setPadding(new Insets(15, 66, 50, 10));
						
						// the execution time from Heap method
						String theStringHeap = String.valueOf(sort.sortTheHeap(list));
						Label label5 = new Label(theStringHeap);
						label5.setPadding(new Insets(15, 66, 50, 10));
						
						
						HBox hBoxValue3 = new HBox();
						hBoxValue3.getChildren().addAll(label,label1,label2,label5);
						
						border.setCenter(hBoxValue3);
			
			
			
		});
		
		Button button4 = new Button("200000");
		button4.setPrefSize(100, 50);
		
		button4.setOnAction(e -> {
			int n = 200000;
			 
			list = new double[n];
			for (int i = 0; i < 100; i++) {
			    list[i] =  (Math.random() * 10);
			}// end for			
			
			// call selection sort from the inner class.
			Sorting sort = new Sorting();
			
						// the execution time of selection method
						String theStringSelection = String.valueOf(sort.selectionSort(list));
						Label label = new Label(theStringSelection);
						label.setPadding(new Insets(15, 66, 50, 66));
						
						// the execution time from Insertion method
						String theStringInsertion = String.valueOf(sort.insertionSort(list));
						Label label1 = new Label(theStringInsertion);
						label1.setPadding(new Insets(15, 66, 50, 20));
						
						// the execution time from Bubble method
						String theStringBubble = String.valueOf(sort.bubble_srt(list));
						Label label2 = new Label(theStringBubble);
						label2.setPadding(new Insets(15, 66, 50, 10));
						
						// the execution time from Merge method
//						String theStringMerge = String.valueOf(sort.mergeSort(list));
//						Label label3 = new Label(theStringMerge);
//						label3.setPadding(new Insets(15, 66, 50, 66));
//					
						// the execution time from Quick method
//						int low = 0;
//						int high = list.length - 1;
//						String theStringQuick = String.valueOf(sort.quickSort(list, low , high));
//						Label label4 = new Label(theStringQuick);
//						label4.setPadding(new Insets(15, 66, 50, 10));
						
						// the execution time from Heap method
						String theStringHeap = String.valueOf(sort.sortTheHeap(list));
						Label label5 = new Label(theStringHeap);
						label5.setPadding(new Insets(15, 66, 50, 10));
						
						
						HBox hBoxValue4 = new HBox();
						hBoxValue4.getChildren().addAll(label,label1,label2,label5);
						
						border.setCenter(hBoxValue4);
		});
		
		Button button5 = new Button("250000");
		button5.setPrefSize(100, 50);
		
		button5.setOnAction(e -> {
			int n = 250000;
			 list = new double[n];
			for (int i = 0; i < 100; i++) {
			    list[i] =  (Math.random() * 10);
			}// end for			
			
			// call selection sort from the inner class.
			Sorting sort = new Sorting();
			
						// the execution time of selection method
						String theStringSelection = String.valueOf(sort.selectionSort(list));
						Label label = new Label(theStringSelection);
						label.setPadding(new Insets(15, 66, 50, 66));
						
						// the execution time from Insertion method
						String theStringInsertion = String.valueOf(sort.insertionSort(list));
						Label label1 = new Label(theStringInsertion);
						label1.setPadding(new Insets(15, 66, 50, 20));
						
						// the execution time from Bubble method
						String theStringBubble = String.valueOf(sort.bubble_srt(list));
						Label label2 = new Label(theStringBubble);
						label2.setPadding(new Insets(15, 66, 50, 10));
						
						// the execution time from Merge method
//						String theStringMerge = String.valueOf(sort.mergeSort(list));
//						Label label3 = new Label(theStringMerge);
//						label3.setPadding(new Insets(15, 66, 50, 66));
//					
						// the execution time from Quick method
//						int low = 0;
//						int high = list.length - 1;
//						String theStringQuick = String.valueOf(sort.quickSort(list, low , high));
//						Label label4 = new Label(theStringQuick);
//						label4.setPadding(new Insets(15, 66, 50, 10));
						
						// the execution time from Heap method
						String theStringHeap = String.valueOf(sort.sortTheHeap(list));
						Label label5 = new Label(theStringHeap);
						label5.setPadding(new Insets(15, 66, 50, 10));
						
						
						HBox hBoxValue5 = new HBox();
						hBoxValue5.getChildren().addAll(label,label1,label2,label5);
						
						border.setCenter(hBoxValue5);
		});
		
		Button button6 = new Button("300000");
		button6.setPrefSize(100, 50);
		button6.setOnAction(e-> {
			int n = 300000;
			 list = new double[n];
			for (int i = 0; i < 100; i++) {
			    list[i] =  (Math.random() * 10);
			}// end for			
			
			// call selection sort from the inner class.
			Sorting sort = new Sorting();
			
						// the execution time of selection method
						String theStringSelection = String.valueOf(sort.selectionSort(list));
						Label label = new Label(theStringSelection);
						label.setPadding(new Insets(15, 66, 50, 66));
						
						// the execution time from Insertion method
						String theStringInsertion = String.valueOf(sort.insertionSort(list));
						Label label1 = new Label(theStringInsertion);
						label1.setPadding(new Insets(15, 66, 50, 20));
						
						// the execution time from Bubble method
						String theStringBubble = String.valueOf(sort.bubble_srt(list));
						Label label2 = new Label(theStringBubble);
						label2.setPadding(new Insets(15, 66, 50, 10));
						
						// the execution time from Merge method
//						String theStringMerge = String.valueOf(sort.mergeSort(list));
//						Label label3 = new Label(theStringMerge);
//						label3.setPadding(new Insets(15, 66, 50, 66));
//					
						// the execution time from Quick method
//						int low = 0;
//						int high = list.length - 1;
//						String theStringQuick = String.valueOf(sort.quickSort(list, low , high));
//						Label label4 = new Label(theStringQuick);
//						label4.setPadding(new Insets(15, 66, 50, 10));
						
						// the execution time from Heap method
						String theStringHeap = String.valueOf(sort.sortTheHeap(list));
						Label label5 = new Label(theStringHeap);
						label5.setPadding(new Insets(15, 66, 50, 10));
						
						
						HBox hBoxValue6 = new HBox();
						hBoxValue6.getChildren().addAll(label,label1,label2,label5);
						
						border.setCenter(hBoxValue6);
		});
		
		border.setLeft(vboxButton);
		
		vboxButton.getChildren().addAll(button1,button2,button3,button4,button5,button6);
		
		return border;
	}
	
}

 class Sorting{
	
	 
	 private static int N;
	 
	public long selectionSort(double[] list){

		long t1 = System.currentTimeMillis();
        
		for (int i = 0; i < list.length; i++) {
			 double min= list[i];
			int  minIndex = i;	
			for (int j = i+1; j < list.length; j++) {
				if (min > list[j]) {
			          min = list[j];
			          minIndex = j;
			        }
			      }
			     
			      if (minIndex != i) {
			        list[minIndex] = list[i];
			        list[i] = min;
			      }
		}
		long t2 = System.currentTimeMillis();

		
		 return t2 - t1;
	}
	
	public Long insertionSort(double[] list){
		
		long t1 = System.currentTimeMillis();
		
		double temp;
        for (int i = 1; i < list.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(list[j] < list[j-1]){
                    temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }

        Long t2 = System.currentTimeMillis();
        
        return t2 - t1;
        
    }
	
	 public long bubble_srt(double[] list) {
	       
		 long t1 = System.currentTimeMillis();
		 
		 int n = list.length;
	        int k;
	        for (int m = n; m >= 0; m--) {
	            for (int i = 0; i < n - 1; i++) {
	                k = i + 1;
	                if (list[i] > list[k]) {
	                    swapNumbers(i, k, list);
	                }
	            }
	            printNumbers(list);
	        }
	        
	        long t2 = System.currentTimeMillis();
	        
	        return t2 -t1;
	    }
	  
	    private void swapNumbers(int i, int j, double[] list) {
	  
	        int temp;
	        temp = (int) list[i];
	        list[i] = list[j];
	        list[j] = temp;
	    }
	  
	    
	    private void printNumbers(double[] list) {
	          
	        for (int i = 0; i < list.length; i++) {
	            //System.out.print(list[i] + ", ");
	        }
	     //   System.out.println("\n");
	    }
	    
	    
	    
	    public long mergeSort(Comparable[] list) 
	    {
	    	
	    	long t1 = System.currentTimeMillis();
	    	
	        //If list is empty; no need to do anything
	        if (list.length <= 1) {

	        }
	         
	        //Split the array in half in two parts
	        Comparable[] first = new Comparable[list.length / 2];
	        Comparable[] second = new Comparable[list.length - first.length];
	        System.arraycopy(list, 0, first, 0, first.length);
	        System.arraycopy(list, first.length, second, 0, second.length);
	         
	        //Sort each half recursively
	        mergeSort(first);
	        mergeSort(second);
	         
	        //Merge both halves together, overwriting to original array
	        merge(first, second, list);
	        
	        long t2 = System.currentTimeMillis();
	        
	        return t2 - t1;
	    }
	     

	    private void merge(Comparable[] first, Comparable[] second, Comparable[] result) 
	    {
	        //Index Position in first array - starting with first element
	        int iFirst = 0;
	         
	        //Index Position in second array - starting with first element
	        int iSecond = 0;
	         
	        //Index Position in merged array - starting with first position
	        int iMerged = 0;
	         
	        //Compare elements at iFirst and iSecond, 
	        //and move smaller element at iMerged
	        while (iFirst < first.length && iSecond < second.length) 
	        {
	            if (first[iFirst].compareTo(second[iSecond]) < 0) 
	            {
	                result[iMerged] = first[iFirst];
	                iFirst++;
	            } 
	            else
	            {
	                result[iMerged] = second[iSecond];
	                iSecond++;
	            }
	            iMerged++;
	        }
	       
	    }
	 
	   
	    public long quickSort(int low, int high) {
			
	    	long t1 = System.currentTimeMillis();
	    	
	    	if (MainClass.list == null || MainClass.list.length == 0)
	    		return 0;
	 
			if (low >= high)
				return 0;

	 
			// pick the pivot
			int middle = low + (high - low) / 2;
			int pivot = (int) MainClass.list[middle];
	 
			// make left < pivot and right > pivot
			int i = low, j = high;
			while (i <= j) {
				while (MainClass.list[i] < pivot) {
					i++;
				}
	 
				while (MainClass.list[j] > pivot) {
					j--;
				}
	 
				if (i <= j) {
					int temp = (int) MainClass.list[i];
					MainClass.list[i] = MainClass.list[j];
					MainClass.list[j] = temp;
					i++;
					j--;
				}
			}
	 
			// recursively sort two sub parts
			if (low < j)
				quickSort( low, j);
	 
			if (high > i)
				quickSort(i, high);
			
			
			long t2 = System.currentTimeMillis();
			
			return t2 - t1 ;
		}
	
	 
	   
	    
	   
	    public long sortTheHeap(double[] list)
	    {       
	    	long t1 = System.currentTimeMillis();
	    	
	        heapify(list);        
	        for (int i = N; i > 0; i--)
	        {
	            swap(list,0, i);
	            N = N-1;
	            maxheap(list, 0);
	        }
	        
	        long t2 = System.currentTimeMillis();
	        
	        return t2 - t1;
	    }     
	    /* Function to build a heap */   
	    public static void heapify(double[] list)
	    {
	        N = list.length-1;
	        for (int i = N/2; i >= 0; i--)
	            maxheap(list, i);        
	    }
	    /* Function to swap largest element in heap */        
	    public static void maxheap(double[] list, int i)
	    { 
	        int left = 2*i ;
	        int right = 2*i + 1;
	        int max = i;
	        if (left <= N && list[left] > list[i])
	            max = left;
	        if (right <= N && list[right] > list[max])        
	            max = right;
	 
	        if (max != i)
	        {
	            swap(list, i, max);
	            maxheap(list, max);
	        }
	    }    
	    /* Function to swap two numbers in an array */
	    public static void swap(double[] list, int i, int j)
	    {
	        int tmp = (int) list[i];
	        list[i] = list[j];
	        list[j] = tmp; 
	    }    
	 	
}