 
class MinHeap {

	Node arr[];
	int size;
 
	public MinHeap(Node[] arr) {
		this.size = arr.length;
		this.arr = arr;
		// build the heap with every call.
		buildMinHeap();
	}
 
	void exchange(Node[] arr, int i, int j) {

		// swap function get called when i != smallest

		Node temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	Node getMin() {

		if(size <= 0) {
			return null;
		}
		return arr[0];
	}
 
	void minHeapify(int i) {

		//making sure the elements on the right place.

		int l = 2*i + 1;
		int r = 2*i + 2;
		int smallest = i;
 
		if(l < size && arr[l].element < arr[smallest].element)
			smallest = l;

		if(r < size && arr[r].element < arr[smallest].element)
			smallest = r;

		if(smallest != i) {
			// call method exchange to change 
			exchange(arr,i,smallest);
			minHeapify(smallest);
		}
	}
 
	void buildMinHeap() {
        
		//build the subheap 
		for(int i = (arr.length/2) - 1 ; i>=0 ;i--)
			minHeapify(i);
	}
 
	void replaceMin(Node root) {
		// replaceing the last node with the root 
		arr[0] = root;
		minHeapify(0);
	}
}
 
public class MergeKSortedArrays {
 
	public static int element;
	public static int i;
	public static int j;

 public static void main(String[] args) {

		int[][] arr = {{2, 6, 8, 12, 34,300},
                     {1, 9, 20, 25, 70, 99},
                     {23, 34, 90, 100},
					 {0,3,4,200}};
 
		System.out.println("Arrays we are using:");


		for(int[] a : arr) {
			for(int i : a)
				System.out.print(i + " ");
			System.out.println();
		}
		mergeKSortedArrays(arr , arr.length);
	}

	public static void mergeKSortedArrays(int[][] arr, int k) {

		// make node with length of the array
		Node[] hArr = new Node[k];
		int resultSize = 0;


		for(int i=0;i<arr.length;i++) {

			Node node = new Node(arr[i][0],i,1);
			hArr[i] = node;
			resultSize += arr[i].length;
		}
 
		MinHeap mh = new MinHeap(hArr);

		int[] result = new int[resultSize];
 
		for(int i=0;i<resultSize;i++) {
			Node root = mh.getMin();
			result[i] = root.element;
			
			if(root.j < arr[root.i].length)
				root.element = arr[root.i][root.j++];
			else
			root.element = Integer.MAX_VALUE;
				mh.replaceMin(root);
		}
 
		for(int i : result)
			System.out.print(i + " ");
		System.out.println();
 
	}
}