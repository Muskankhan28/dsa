public class linear{
    static int linearSearch(int nums[] , int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {18,12,9,77,50};
        int key = 14;
        System.out.println(linearSearch(nums, key));

    }
}