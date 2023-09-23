public class RotatedDuplicateArray {
    public static void main(String[] args) {
//        int[] arr = {4,5,6,6,7,9,12,0,1,2,4,4};
        int[] arr = {7,8,9,2,2,2,2};
        int peakIndex = findPivotIndoubleRoatedArray(arr);
        System.out.println(peakIndex);
    }
    static int findPivotIndoubleRoatedArray(int[] arr){
        int start = 0;
        int end  = arr.length - 1;

        while (start <= end){
            int mid = start+ (end - start)/2;

            // check if you find direct pivot
            if (arr[mid] > arr[mid+1]){
                // if mid element is greater than mid + 1 element then mid will be pivot. because noramlly mid+1 element should be lesser than mid but at pivot mid is greater than mid + 1
                return mid;
            }
            if (arr[mid] < arr[mid-1]){
                // if mid element is less than mid-1 element then it is obvious that mid-1 element will be my pivot
                return mid-1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // means start , end & middle element are same
                //if there is a condition that arr[start] == arr[mid] == arr[end] then ignore these start & end element by increasing start to start + 1 & end to end - 1. But
                // before ignoring them check whether they are pivot or not?
                //if start element would be pivot then start + 1 element would be lesser similarly check if  if end-1 is pivot then end - 1 will be greater than end element

                if (arr[start] > arr[start+1]){
                    return start;
                }
                start ++ ;
                if (arr[end - 1] > arr[end]){
                    return end-1;
                }
            }else{
                // means the three elements are not equal
                if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]) ){
                    start = mid + 1;
                }else{
                    end = mid - 1; // it is certain that mid is not pivot if it would have been then have caught before
                }
            }
        }
        return -1;
    }
}
