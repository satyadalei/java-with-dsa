// given a sorted rotated array
// no duplicate numbers exist
// find a target
public class RotatedSortedArray {
    public static void main(String[] args) {
//        int[] arr = {7,8,9,10,12};
        int[] arr = {7,8,9,10,12,2,4,5};
        int peak = findPeak(arr);
        int target = 5;
        int targetIndex = findTarget(arr, target, peak);
        System.out.println(peak);
        System.out.println(targetIndex);
    }
    static int findPeak(int[] arr){
       int start = 0;
       int end = arr.length - 1;

       while (start <= end){
           int mid = start + (end - start) / 2;
           if( mid < arr.length - 1 && arr[mid] > arr[mid + 1]){
               return mid;
           }
           if ( mid > 0 && arr[mid] < arr[mid-1]){
               return  mid - 1;
           }
           if (arr[start] >= arr[mid]){
               end = mid - 1;
           }else{
               start = mid + 1;
           }
       }

        return -1;
    }

    static int findTarget(int[] arr, int target, int pivotIndex){
        // if my pivot value is equal to my target
        if (target == arr[pivotIndex]){
            return pivotIndex;
        }
        // 2nd I will check the range of target
        if (target >= arr[0]){
            int start = 0 ;
            int end = pivotIndex - 1 ;
            // apply binary search & return target index
            return binarySearch(arr,target, start, end);
        }

        if (target <= arr[arr.length - 1]){
            int start = pivotIndex + 1 ;
            int end = arr.length - 1;
            return binarySearch(arr,target, start, end);
        }

        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){
       while (start <= end){
           int mid = start + (end - start)/ 2;
           if (arr[mid] == target){
               return  mid;
           }
           if (target > arr[mid]){
               start = mid + 1;
           }
           if (target < arr[mid]){
               end = mid - 1;
           }
       }
       return -1;
    }
}
