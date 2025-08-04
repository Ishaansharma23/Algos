// Bubble Sort

// Sort the unsorted Array

// Input =  {5,4,1,3,2};
// Output = the times of swaps are 4
//          the times of swaps are 3
//          the times of swaps are 1
//          1 2 3 4 5 

// use of turns = Isliye hume multiple passes karne padte hain taaki saare elements apni jagah pe pahunch jayein.

// LOGIC - current elemt ko sth wale s compare kro jonsa bda ho use last mai bhejdo 
// hr ek compairison k bad swap krdo , ek round mai number of j times swap hoga 

// "Adjacent compare and push the biggest to the end in every round."

package Sorting;

public class BubbleSort {
    public static void Sort(int arr[]) {
        for(int i = 0; i < arr.length - 1 ; i++){ //Rounds count karna zaroori hai takki har round ke baad fixed elements ko avoid kar sakein. 
            int swaps = 0;
            // hr ROund mai ek element apni sahi jagah par chal jata hai.
            for(int j = 0 ; j < arr.length - 1 - i ; j++){ //kyuki last elemt kiss s compare krega? 2 > ? isliye arr.l -1
                if (arr[j] > arr[j+1]) { // compares the element with j / j+1
                    int temp = arr[j];  
                    arr[j] = arr[j+1];  // values swap j ki 
                    arr[j+1] = temp;
                    swaps++;
                }
            
            }
            if (swaps == 0) {
                break;
            }
            System.out.println("the times of swaps are " + swaps);
        }
    }
    public static void Print(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Sort(arr);
        Print(arr);
    }
}
