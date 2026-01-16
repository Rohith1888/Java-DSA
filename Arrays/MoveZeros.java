package Arrays;
public class MoveZeros{
     //LeetCode url: https://leetcode.com/problems/move-zeroes/   
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,1,2};
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


     public static void moveZeroes(int[] arr) {
        
         int i=0;
         for(int j=1;j<arr.length;j++){

            if(arr[i]==0 && arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
             if(arr[i]!=0 && arr[j]!=0){
                i++;
            }
            if(arr[j]==0 && arr[i]!=0){
                i++;
            }
           
         }

        }
}