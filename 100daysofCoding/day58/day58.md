# Spiral Matrix 

## Spiral Matrix I 

```java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> sp = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[n-1].length;
        int left = 0, top = 0, bottom = n-1, right = m-1;
        while(left<=right && top <= bottom){
            for(int i=left; i<=right; i++){
                sp.add(matrix[top][i]);
            }
            top++;
            for(int j=top; j<=bottom; j++){
               sp.add(matrix[j][right]);
            }
           right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                   sp.add(matrix[bottom][i]);
               }
               bottom--;
            }
            if(left<=right){
                for(int j=bottom; j>=top; j--){
                sp.add(matrix[j][left]);
                }
            left++;
            }
        }
        return sp;
    }
}
```

