package Arrays;
public class MaxConsecutiveOnes {
    
    //LeetCode URL: https://leetcode.com/problems/max-consecutive-ones/
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count = 0;
            }
            
            if(max_count<count){
                max_count = count;
            }
            

        }
        return max_count;
    }
}
