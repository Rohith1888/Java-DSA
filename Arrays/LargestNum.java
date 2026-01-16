package Arrays;

public class LargestNum {
    
    public static void main(String[] args) {
        
        int arr[] = {8,9,7,20,44,5};
        System.err.println(largestNum(arr));
    }


   public static int largestNum(int arr[]){
        int large = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }
}
