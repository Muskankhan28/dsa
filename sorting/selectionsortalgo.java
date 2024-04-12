public class selectionsortalgo{
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,3,4,1,2};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }

        
    }
   
    }