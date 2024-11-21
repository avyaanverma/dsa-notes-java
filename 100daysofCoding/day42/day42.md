# Last Stones Weight

```java
class Solution {

public int lastStoneWeight(int[] stones) {
	// sort
	// make stones --> list
	// approach
	int c = stones[0];
	int a = stones[n-2];
	int b = nums[n-1];
	while(list.size()>=2){
		if(a!=0){
			nums[n-1]=b-a;
			list.remove(a);
			c = a;
			a=0;
		}
	if(nums[i]>=nums[n-1]){
		.put(c);
		i=0;
		a=nums[n-2];
	} else{
		i++;
		}
	}

}

}
```

### Priority Queue in Java:

In Java, the `PriorityQueue` class is part of the `java.util` package and implements a **Min Priority Queue** by default. For a **Max Priority Queue**, you can use a comparator. Below are the details on how the priority queue works in Java and the associated functions.

---

### Priority Queue in Java:

- **Definition**: In Java, `PriorityQueue` is a collection that orders elements according to their natural ordering (if they implement `Comparable`) or according to a specified comparator.

- **Implementation**: 
  - The `PriorityQueue` in Java is typically implemented as a **heap** (usually a binary heap).
  - It does not allow `null` elements.

- **Default Behavior**: 
  - It is a **Min Priority Queue** by default, meaning the smallest element is given the highest priority.
  - If a **Max Priority Queue** is needed, a custom comparator should be provided when creating the `PriorityQueue` instance.

---

### Key Functions in Java's `PriorityQueue`:

1. **add(E e)** or **offer(E e)**:
   - **Description**: Inserts the specified element into the priority queue.
   - **Time Complexity**: O(log n).
   - **Example**: 
     ```java
     PriorityQueue<Integer> pq = new PriorityQueue<>();
     pq.add(10);  // Inserts 10
     ```

2. **peek()**:
   - **Description**: Retrieves, but does not remove, the head of the queue (element with highest priority).
   - **Time Complexity**: O(1).
   - **Example**: 
     ```java
     Integer head = pq.peek();  // Returns the smallest element without removing it
     ```

3. **poll()**:
   - **Description**: Retrieves and removes the head of the queue. If the queue is empty, it returns `null`.
   - **Time Complexity**: O(log n).
   - **Example**: 
     ```java
     Integer head = pq.poll();  // Removes and returns the smallest element
     ```

4. **remove(Object o)**:
   - **Description**: Removes the specified element from the queue, if present.
   - **Time Complexity**: O(n).
   - **Example**: 
     ```java
     pq.remove(10);  // Removes element 10
     ```

5. **isEmpty()**:
   - **Description**: Checks whether the priority queue is empty.
   - **Time Complexity**: O(1).
   - **Example**:
     ```java
     boolean empty = pq.isEmpty();  // Returns true if the queue is empty
     ```

6. **size()**:
   - **Description**: Returns the number of elements in the priority queue.
   - **Time Complexity**: O(1).
   - **Example**: 
     ```java
     int size = pq.size();  // Returns the number of elements
     ```

7. **contains(Object o)**:
   - **Description**: Returns `true` if the specified element is present in the queue.
   - **Time Complexity**: O(n).
   - **Example**: 
     ```java
     boolean contains = pq.contains(10);  // Checks if element 10 is present
     ```

8. **clear()**:
   - **Description**: Removes all elements from the priority queue.
   - **Time Complexity**: O(n).
   - **Example**: 
     ```java
     pq.clear();  // Removes all elements from the queue
     ```

9. **comparator()**:
   - **Description**: Returns the comparator used for ordering the elements of the queue, or `null` if natural ordering is used.
   - **Time Complexity**: O(1).
   - **Example**:
     ```java
     Comparator<? super Integer> comp = pq.comparator();  // Returns the comparator or null
     ```

10. **change priority** (Custom logic):
   - **Description**: Java’s `PriorityQueue` does not provide a built-in method for directly changing the priority of an element. To change the priority, you typically need to remove the element, modify it, and reinsert it with the new priority.
   - **Time Complexity**: O(n) for removal and O(log n) for insertion.
   - **Example**:
     ```java
     pq.remove(10);  // Remove element
     pq.add(20);     // Add element with a new priority (20)
     ```

---

### Example Code:

```java
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Min Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);  // Adds element 10
        pq.add(5);   // Adds element 5
        pq.add(20);  // Adds element 20

        System.out.println("Head of queue (peek): " + pq.peek());  // Output: 5
        System.out.println("Queue size: " + pq.size());  // Output: 3

        System.out.println("Removed element (poll): " + pq.poll());  // Output: 5
        System.out.println("New head of queue: " + pq.peek());  // Output: 10

        pq.remove(10);  // Removes element 10
        System.out.println("Queue after removal of 10: " + pq.peek());  // Output: 20
    }
}
```

### Max Priority Queue Example:

To create a **Max Priority Queue**, use a custom comparator.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Max Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(10);
        pq.add(5);
        pq.add(20);

        System.out.println("Max Priority Queue Head (peek): " + pq.peek());  // Output: 20
        System.out.println("Removed element (poll): " + pq.poll());  // Output: 20
    }
}
```

---

### Summary of Java `PriorityQueue` Functions:

| Function              | Description                                                                 | Time Complexity |
|-----------------------|-----------------------------------------------------------------------------|-----------------|
| `add(e)` / `offer(e)`  | Inserts an element into the queue.                                           | O(log n)        |
| `peek()`               | Retrieves the highest priority element without removing it.                  | O(1)            |
| `poll()`               | Retrieves and removes the highest priority element.                          | O(log n)        |
| `remove(o)`            | Removes a specific element from the queue.                                   | O(n)            |
| `isEmpty()`            | Checks if the queue is empty.                                                | O(1)            |
| `size()`               | Returns the number of elements in the queue.                                | O(1)            |
| `contains(o)`          | Checks if an element is present in the queue.                               | O(n)            |
| `clear()`              | Removes all elements from the queue.                                         | O(n)            |
| `comparator()`         | Returns the comparator used for ordering or `null` if using natural ordering.| O(1)            |

This should give you a comprehensive understanding of how to use Java's `PriorityQueue` along with the key functions.