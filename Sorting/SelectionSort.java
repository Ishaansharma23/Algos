// Selection Sort

// Sort the unsorted Array

// Input =  {29, 10, 14, 37, 13};
// Output = 10 13 14 29 37

// LOGIC - smallest elemnt nikalo array mai s or fir compare kro current element s jonsa 
// chota hoga wo age ajayega aise hi ek round ka krdo then fir swap krdo after the 1 round
// 1 round complete krne pr swap hoga 

// (“Har round mein, unsorted part ka sabse chhota element dhoondo aur usse current 
// position ke element ke saath swap karo.”)

// "Select the smallest and place it at the front."

package Sorting;

public class SelectionSort {
    public static void Sort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the current element at index i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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

