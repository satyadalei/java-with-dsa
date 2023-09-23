// find the no of rotation a rotated array has made
public class NoOfRotationinRotatedArray {
    public static void main(String[] args) {
        int[] arr = {8,9,10,12,2,4,5,7}; // not duplicated
        int[] arr2 = {4,5,6,6,7,0,1,2,4};
        int[] arr3 = {0,1,2,4,5,6,6,7};
        int peakIndex = findPeak(arr3);
//        int  peakIndex = findPeakInDuplicateArr(arr3) ;
        System.out.println(peakIndex+1);
    }
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start<= end){
            int mid =  start + (end-start)/2 ;

            if (arr[mid] > arr[mid+1]){
                return mid;
            }
            if (arr[mid] < arr[mid-1]){
                return  mid - 1;
            }

            if (arr[start] > arr[mid]){
                end = mid - 1;
            }

            if (arr[mid] > arr[start]){
                start = mid + 1;
            }
        }
        return -1;
        // means array is not rotated
    }

    static int findPeakInDuplicateArr(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2 ;
            if (arr[mid] > arr[mid-1]){
                return mid;
            }
            if (arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            // removing duplicate elemnets
            if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end-1] > arr[end]){
                    return end - 1;
                }
                end--;
            }

            if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start =  mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
        // means array is not rotated if it returns -1
    }
}
