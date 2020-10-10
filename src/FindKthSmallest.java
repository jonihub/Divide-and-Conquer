public class FindKthSmallest {

    public static void main(String[] args) {
        int arr[] = {-8, 25, 2, 19, 15, 5, 9, -23, 28}; 
        int k = 3; 
        System.out.println("The Kth smallest element is: " + select(arr, 0, arr.length - 1, k));
    }

    private static int select(int[] arr, int first, int last, int k) {
        
        int mid = partition(arr, first, last);

        if (k <= mid - first) {
            return select(arr, first, mid - 1, k);
        } else if (k > mid - first + 1) {
            return select(arr, mid + 1, last, k - (mid - first + 1));
        }
        else {
            return arr[mid];
        }
    }

    private static int partition(int arr[], int left, int right) { 
        int pivot = arr[right];  //Set pivot to last element
        int index = (left - 1); //Set index of smaller element 
        
        for (int i = left; i < right; i++) { 
            // If the current element is smaller than the pivot 
            // Swap arr[index] and arr[i] 
            if (arr[i] < pivot) { 
                index++; 
                
                int temp = arr[index]; 
                arr[index] = arr[i]; 
                arr[i] = temp; 
            } 
        } 
        // Swap arr[i + 1] and arr[right] or the pivot 
        int temp = arr[index + 1]; 
        arr[index + 1] = arr[right]; 
        arr[right] = temp; 
  
        return index + 1; 
    } 
}
