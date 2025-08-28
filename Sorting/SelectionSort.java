// Selection Sort

// Sort the unsorted Array

// Input =  {29, 10, 14, 37, 13};
// Output = 10 13 14 29 37

// LOGIC - smallest elem nikalo adjacent s compare krke fir jo smallest aya usko swap krdo bahar wale loop k index s



package Sorting;

public class SelectionSort {
    public static void Sort(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;   // asuming yehi sbse chota elem hai 
            for(int j = i + 1; j < arr.length;j++){
                if (arr[minIndex] > arr[j]) {
                    minIndex = j; // minindex ko update krdo
                }
            }
    
            // pehle min nikalo sbse loop laga kr fir swap krdo jonsa bahar wala idx ka loop hai usske sth
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
          }
          for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
          }
    }

    public static void Print(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        Sort(arr);    // Sort the array
        Print(arr);   // Output: 10 13 14 29 37
    }
}

