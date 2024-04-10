public class binary{
    static int binarysearch(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return -1;
    }
public static void main(String[] args) {
    int arr[] = {-1,0,3,5,9,12};
    int target = 9;
  System.out.println(binarysearch(arr, target));
    
}

}