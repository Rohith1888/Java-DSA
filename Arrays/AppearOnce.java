package Arrays;


// Find the number that appears once, and the other numbers twice

// Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
public class AppearOnce {
    
    public static void main(String[] args) {
       
        int arr[] = {4,1,2,1,2};
        System.out.println(findTheNumberAppearOnce(arr));
    }

    // we can use another apporaches like hashing also

    // xor has the special property
    // a ^ a = 0
    // a ^ 0 = a
    static int findTheNumberAppearOnce(int arr[]){

        int xor = 0;

        for(int i = 0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;

    }
}
