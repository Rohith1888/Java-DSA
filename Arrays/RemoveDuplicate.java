package Arrays;

public class RemoveDuplicate {

    //LeetCode URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1,2,2,3,3,4};
        int index= removeDuplicateElements(arr);
        for(int i=0;i<=index;i++){
            System.err.println(arr[i]);
        }

    }



    static int removeDuplicateElements(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[++i] = arr[j];
            }
        }
        return i;
    }
}
