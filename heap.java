
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;


public class heap{
    public static void main(String[] args) {
        
        // Min-Heap 
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.contains(10);
        minHeap.peek();     // get minimum element 
        minHeap.poll();     // remove min element

        // Max-Heap 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.poll(); // remove max element 

        // // Custom Heap 
        // Min-Heap by Frequency
        PriorityQueue<int[]> customHeap = new PriorityQueue<>((a, b) -> a[1]-b[1]);    
        //  Max-Heap by Frequency 
        PriorityQueue<int[]> customheap = new PriorityQueue<>((a, b) -> b[1]-a[1]);

        // Building Heap form Array - This runs in O(n) due to Floyd’s heapify algorithm.
        PriorityQueue<Integer> heap = new PriorityQueue<>(Arrays.asList(5, 1, 3, 9));

    }
}
