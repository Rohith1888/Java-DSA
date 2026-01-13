package sorting;
class SelectionSort{
    public static void main(String[] args) {


        int arr[] = {13,46,24,32,20,9};

        selectionSort(arr, arr.length);

        // print the values

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }


    // Time Complexity for this sorting technique will be O(n^2)
    // This Selection sort selectes the minimum element from the array and places in the next starting position

    
    static void selectionSort(int arr[], int n){


        //for loop up to n-1 since we ignore the last element as it always sorted for single element

        for(int i=0;i<=n-1;i++){

            // search the min from i to n

            int min = i;

            for(int j=i;j<n;j++){

                //find the minimum

                if(arr[j] < arr[min]){

                    min = j;
                }

            }

            // swap the minimum and the i

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

    }
}