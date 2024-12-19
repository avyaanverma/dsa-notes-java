public class merge2arrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 10};

        int i =0;
        int j =0;
        int n = arr1.length;
        int m = arr2.length;

        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                System.out.println(arr1[i]);
                i++;
            }else{
                System.out.println(arr2[j]);
                j++;
            }
        }

        if(i==n){
            while(j<m){
                System.out.println(arr2[j]);
                j++;
            }
        }else{
            while(i<n){
                System.out.println(arr1[i]);
                i++;
            }
        }

    }
}
