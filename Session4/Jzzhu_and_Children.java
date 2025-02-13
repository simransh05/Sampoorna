package Session4;

import java.util.*;

public class Jzzhu_and_Children {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        // Read the number of children and the number of candies given at a time
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Read the candy requirements for each child
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Queue to manage the children
        Queue<Integer> queue = new LinkedList<>();
        
        // Initialize the queue with the indices of the children
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }
        
        int lastChild = -1; // To keep track of the last child who goes home
        
        // Process the queue
        while (!queue.isEmpty()) {
            int currentChildIndex = queue.poll(); // Get the index of the current child
            a[currentChildIndex] -= m; // Give m candies to the current child
            
            if (a[currentChildIndex] > 0) {
                // If the child still needs more candies, they go to the end of the line
                queue.add(currentChildIndex);
            } else {
                // If the child has received enough candies, they go home
                lastChild = currentChildIndex + 1; // Store the 1-based index of the child
            }
        }
        
        // Output the number of the last child who goes home
        System.out.println(lastChild);
	}
}
