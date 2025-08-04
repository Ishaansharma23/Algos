// reverse order sorting hmesha objects pr kaam krta hai int - primitive type hai , Integer sahi hoga as obj hai 
// Arrays.sort(arr , Collections.reverseOrder) - descending order
// Arrays.sort(arr , konse idx s , konse index tk) - specific range

// input = {5, 2, 8, 1, 9};  
// output1 = Ascending Order: 1 2 5 8 9 

// input2= {3, 5, 7, 9, 1};
// Descending Order: 9 7 5 3 1 %  

package Sorting;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void NormalSort(int arr[]) {
        Arrays.sort(arr); // ascending order sort
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseOrderSort(Integer arr[]) {
        Arrays.sort(arr, Collections.reverseOrder()); // descending order sort
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8, 1, 9};       // for ascending sort
        Integer[] arr2 = {3, 5, 7, 9, 1};   // for descending sort

        System.out.print("Ascending Order: ");
        NormalSort(arr1);

        System.out.println();

        System.out.print("Descending Order: ");
        reverseOrderSort(arr2);
    }
}
