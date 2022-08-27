package gfg.heap;

import java.util.Arrays;

class MinHeap {
    int[] harr;
    int capacity;
    int heap_size;
    MinHeap(int cap) {
        heap_size = 0;
        capacity = cap;
        harr = new int[cap];
    }
    int parent(int i) { return (i - 1) / 2; }
    int left(int i) { return (2 * i + 1); }
    int right(int i) { return (2 * i + 2); }

    //Function to extract minimum value in heap and then to store 
    //next minimum value at first index.
    int extractMin()
    {
        
        if(heap_size>0) {
        	if(heap_size == 1) {
        	    heap_size--;
        	 	return harr[0]; 
        	}else {
        		int res = harr[0];
        		harr[0]=harr[heap_size-1];
        		harr[heap_size-1]=res;
        		heap_size--;
        		MinHeapify(0);
        		return res;
        	}
        }else {
        	return -1;
        }
    }

    //Function to insert a value in Heap.
    void insertKey(int k) 
    {
        if(heap_size == capacity) return;
        
        heap_size++;
        harr[heap_size-1] = k;
        for(int i=heap_size-1; i!=0 && harr[parent(i)]>harr[i]; ) {
        	int tmp =  harr[parent(i)];
        	 harr[parent(i)] = harr[i];
        	 harr[i] = tmp;
        	 i= parent(i);
        }
    }

    //Function to delete a key at ith index.
    void deleteKey(int i) 
    {
      if(i>=heap_size || heap_size== 0) return;
        if(i<=heap_size-1) decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }

    //Function to change value at ith index and store that value at first index.
    void decreaseKey(int i, int new_val) 
    {
        harr[i] = new_val;
        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
    }

    /* You may call below MinHeapify function in
      above codes. Please do not delete this code
      if you are not writing your own MinHeapify */
    void MinHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && harr[l] < harr[i]) smallest = l;
        if (r < heap_size && harr[r] < harr[smallest]) smallest = r;
        if (smallest != i) {
            int temp = harr[i];
            harr[i] = harr[smallest];
            harr[smallest] = temp;
            MinHeapify(smallest);
        }
    }

    
    
    public static void main(String[] args) {
    	MinHeap heap = new MinHeap(7);
    	heap.insertKey(4);
    	heap.insertKey(2);
    	System.out.println(heap.extractMin());
    	heap.insertKey(6);
    	heap.deleteKey(0);
    	System.out.println(heap.extractMin());
    	System.out.println(heap.extractMin());
    	
    	/*
    	heap.insertKey(8);
    	heap.insertKey(9);
    	System.out.println("::>>"+Arrays.toString(heap.harr));
    	heap.deleteKey(1);
    	System.out.println("::>>"+Arrays.toString(heap.harr));
    	System.out.println(heap.extractMin());
    	System.out.println(heap.extractMin());*/
	}
    
}

