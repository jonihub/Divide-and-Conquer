/**
 * Java program to find the last occurrence
 * of an element (k) in a sorted array.
 **/
public class LastOccurence {
    public static void main(String[] args) {
        //Original test array: 0, 1, 2, 2, 2, 2, 12, 17, 19
        int[] array = {1, 2, 3, 3, 4, 4, 5, 6, 7, 7, 7, 9, 9, 10, 11, 12, 13, 13};   
        int nums = array.length;
        int target = 7;

        System.out.println("The last occurence of the target is: " + lastOccur(array, nums, target));
    }

    /* Once k exists in the array then lastOccur returns 
    the index of the last occurrence of k. If k does not exist
    it returns -1.
    */
    public static int lastOccur(int[] arr, int n, int k) {

        int low = 0;
        int high = n - 1;
        int result = -1;

        while (low <= high) {
            //Implement Binary Search to divide array
            int mid = (low + high) / 2;
            
            //Check to see is k = mid. 
            //If not move to right or left accordingly.
            if (k == arr[mid]) {
                result = mid;
                low = mid + 1;
            } 
            else if (k < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}