package Arrays;


//LeetCode URL: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class CheckIfSorted {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,3,6};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean check(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[(i+1)%arr.length]) {
				count++;
			}
		}
		return (count<=1);
    }
}
