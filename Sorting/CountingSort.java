package Sorting;

public class CountingSort {
    public static void CountSort(int arr[]) {
        // pehle largest elem
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ; i++){
            largest = Math.max(largest, arr[i]);
        }

        // ek count arr bnaynge 
        int count[] = new int[largest + 1]; // largest + 1 isliye agr 7 hai to loop 0 to 6 tk jayega hume 7 bhi chahiye 
        for(int i = 0; i < arr.length ; i++){
            count[arr[i]]++;// // arr ke current element (arr[i]) ka count badha rahe hain
            // Jaise agar arr[i] = 3 hai, toh count[3]++ matlab 3 ek baar aur mil gaya
            
            // - arr[i] i = 1 , arr[1] = 4 , count[arr[1]] = count[4]++ mtlb count array mai 4 index pr
            // 4 ki value 1 se badh jayegi , mtlb 4 , (2 baar aya hai)
        }

        // sorting
        int j = 0;
        for(int i = 0 ; i < count.length ; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        CountSort(arr);
    }
}
