package Sorting;

public class InsertionSort {
    public static void Sort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int curr = i;
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > arr[curr]){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = arr[curr];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Sort(arr);
    }
}
