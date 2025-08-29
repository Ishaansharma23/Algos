package Sorting;

public class InsertionSort {
    public static void Sort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];  // current element ko le lo
            int prev = i - 1;   // uske pehle wale index se compare karna start karo
        
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev]; // bade element ko right shift karo
                prev--;
            }
            arr[prev + 1] = curr; // correct jagah par current element insert kar do
        }
        
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Sort(arr);
    }
}
