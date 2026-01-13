package sorting;

public class BubbleSort {

     public static void main(String[] args) {


        int arr[] = {1,2,3,4,5,6,7,8,9};

        bubbleSort(arr, arr.length);

        // print the values

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    // Time complexity: O(n^2)
    
    static void bubbleSort(int arr[], int n){
        
        for(int i=n-1;i>=1;i--){

            // swap adjacently if there is no correct order till 0 to i-1
            int swap = 0;
            // track the swappings for futher optimization if no swap occurs we can conclude that the array is sorted

            for(int j=0;j<=i-1;j++){

                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            // return if no swaps
            if(swap==0) {
                return;

            }

            
        }
    }
    
}
