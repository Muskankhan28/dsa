public class insertionsortalgo{
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,3,5,2,7,1,8};
        insertionSort(arr);
       for (int i : arr) {
        System.out.print(i+ " ");
        
       }
    }
}