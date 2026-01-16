package Arrays;
public class SecondLargest {

    public static void main(String[] args) {
        
        int arr[] = {1,2,4,7,7,5};
        System.out.println(secondLargest(arr));
    }

    // //Brute Force
    //     public static int secondLargest(int arr[]){

    //     int n = arr.length;
    // // Sort the array
    //     Arrays.sort(arr);
    //     int secondLargest = -1; // assuming no negatives in the array
    //     for(int i=n-2;i>=0;i--){
    //         if(arr[i]!=arr[i+1]){
    //          secondLargest = arr[i];
    //          break;
    //         }
    // }
    //  return secondLargest;

    // }

    //Better Approach
    // static int secondLargest(int arr[]){
    //     // first find the largest
    //     int large = LargestNum.largestNum(arr);

    //     int secondLargest = -1; // assuming no negative numbers in the array
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]!=large && arr[i]>secondLargest){
    //             secondLargest = arr[i];
    //         }
    //     }
    //     return secondLargest;

    // }



    // optimal Approach

    static int secondLargest(int arr[]){
        int large = arr[0], sl = -1; // assuming no negative elements in the array
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){
                sl = large;
                 large = arr[i];
            }
            else if(arr[i]!=large && arr[i]>sl){
                sl = arr[i];
            }


        }
        return sl;

    }
    
}



