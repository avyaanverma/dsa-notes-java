class Solution {
    // Function to find three numbers such that arr[smaller[i]] < arr[i] <
    // arr[greater[i]]
    public List<Integer> find3Numbers(int[] arr) {
        // code here
        int n = arr.length;
        if (n < 3) return new ArrayList<>();  // No possible triplet in an array with less than 3 elements
        
        int[] left_smaller = new int[n];
        int[] right_greater = new int[n];

        // Initialize left_smaller and right_greater
        left_smaller[0] = -1;
        right_greater[n - 1] = -1;

        // Fill left_smaller array
        int min = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[min]) {
                min = i;
                left_smaller[i] = -1;
            } else {
                left_smaller[i] = min;
            }
        }

        // Fill right_greater array
        int max = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= arr[max]) {
                max = i;
                right_greater[i] = -1;
            } else {
                right_greater[i] = max;
            }
        }

        // Now find a triplet such that arr[left_smaller[i]] < arr[i] < arr[right_greater[i]]
        for (int j = 0; j < n; j++) {
            if (left_smaller[j] != -1 && right_greater[j] != -1) {
                List<Integer> result = new ArrayList<>();
                result.add(arr[left_smaller[j]]);
                result.add(arr[j]);
                result.add(arr[right_greater[j]]);
                return result;
            }
        }

        // If no such triplet is found
        return new ArrayList<>();
    }
}