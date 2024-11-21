You are given a **0-indexed** integer array `nums` and a target element `target`.

A **target index** is an index `i` such that `nums[i] == target`.

Return _a list of the target indices of_ `nums` after _sorting_ `nums` _in **non-decreasing** order_. If there are no target indices, return _an **empty** list_. The returned list must be sorted in **increasing** order.

```java
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // sorting the array
        // selection sort
        int n = nums.length;
          for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(nums[j]<nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        // find the no indices
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        for(int num : nums){
            if(num==target){
                ans.add(i);
            }
            i++;
        }
        return ans;
    }
}
```


```java
import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      List<Integer> l = new ArrayList<>();
      int count=0;
      int currCount = 0;
      for(int i=0;i<nums.length; i++)
      {
        if(nums[i]==target) currCount++;
        else if(nums[i]<target) count++;
      }
      for(int i=0; i<currCount; i++)
      {
        l.add(count++);
      }
      return l; 
    }
}
```




## Sorting
Sorting is the process of arranging elements in a particular order, typically ascending or descending.

### 1. **Selection Sort**

- **Definition**: Selection Sort repeatedly finds the minimum element from the unsorted portion and places it at the beginning.
- **Algorithm**:
    1. Iterate from the beginning of the array.
    2. For each position, find the minimum element in the unsorted portion.
    3. Swap the minimum element with the current position.
    4. Repeat until the array is sorted.
- **Time Complexity**: O(n2)
![[Pasted image 20241114225405.png]]
- **Code**:
```java
void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

```
### 2. **Bubble Sort**

**Definition**: Bubble Sort repeatedly swaps adjacent elements if they are in the wrong order.
**Algorithm**:
    1. Traverse the array, comparing adjacent elements.
    2. Swap them if they are in the wrong order.
    3. Repeat until the array is sorted.
**Time Complexity**: O(n2)O(n^2)O(n2), but it becomes O(n)O(n)O(n) for nearly sorted arrays.
**Code**:
```java
void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

```

### 3. **Insertion Sort**

- **Definition**: Insertion Sort builds the sorted array one item at a time by inserting each element into its correct position.
- **Algorithm**:
    1. Start from the second element and compare it with elements before it.
    2. Shift larger elements one position ahead to make room for the current element.
    3. Insert the current element into the correct position.
- **Time Complexity**: O(n2)O(n^2)O(n2), but it is efficient for small or nearly sorted arrays.
- **Code**:
```java
void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

```

### 4. **Merge Sort**

- **Definition**: Merge Sort is a divide-and-conquer algorithm that splits the array into halves, sorts each half, and then merges them.
- **Algorithm**:
    1. Divide the array into two halves.
    2. Recursively apply merge sort to each half.
    3. Merge the two sorted halves.
- **Time Complexity**: O(nlog⁡n)O(n \log n)O(nlogn)
- **Code**:
```java
void mergeSort(int[] arr, int l, int r) {
    if (l < r) {
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
}

void merge(int[] arr, int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;
    int[] L = new int[n1];
    int[] R = new int[n2];
    for (int i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (int j = 0; j < n2; j++)
        R[j] = arr[m + 1 + j];
    int i = 0, j = 0;
    int k = l;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }
    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }
    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}

```
### 5. **Quick Sort**

- **Definition**: Quick Sort is a divide-and-conquer algorithm that partitions the array based on a pivot, then recursively sorts the partitions.
- **Algorithm**:
    1. Pick a pivot element.
    2. Partition the array so that elements smaller than the pivot are on the left and elements greater are on the right.
    3. Recursively apply quicksort to the partitions.
- **Time Complexity**: O(nlog⁡n)O(n \log n)O(nlogn), but it can degrade to O(n2)O(n^2)O(n2) in the worst case.
- **Code**:
```java
void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
}

```

### Recommended Learning Order

1. **Selection Sort** – Easy to understand and good for learning the basic concept of sorting.
2. **Bubble Sort** – Simple, teaches swapping and adjacent comparisons.
3. **Insertion Sort** – Good for learning about efficient sorting for nearly sorted data.
4. **Merge Sort** – Introduces recursion and divide-and-conquer, which are core concepts in DSA.
5. **Quick Sort** – A powerful sorting technique commonly used in practice.

### Notes Summary

- **Selection Sort**: Basic, O(n2)O(n^2)O(n2) time complexity, stable.
- **Bubble Sort**: Simple, O(n2)O(n^2)O(n2) time complexity, adaptive (works well with nearly sorted arrays).
- **Insertion Sort**: O(n2)O(n^2)O(n2), but efficient on small datasets, stable.
- **Merge Sort**: Efficient O(nlog⁡n)O(n \log n)O(nlogn), stable, ideal for large datasets.
- **Quick Sort**: O(nlog⁡n)O(n \log n)O(nlogn) average, O(n2)O(n^2)O(n2) worst-case, in-place, faster but unstable.