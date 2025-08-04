// Ques - Use the following sorting algorithms tosort an array in DESCENDING order


package Sorting;

public class Assignment {
    public static void BubbleSort(int arr[]) { // turns wala loop lagao fir inner loop mai 
        for(int i = 0; i < arr.length - 1 ; i++){ // adjacent element compare kro jonsa bda hoga wo piche bhejo 
            for(int j = 0 ; j < arr.length - 1 - i ; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void SelectionSort(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            int minPos = i;// Har round mein assume karo current position ka element minimum hai
            for(int j = i + 1; j < arr.length; j++) {// Inner loop: i+1 se end tak jaake check karo koi aur chhota hai kya
                // Agar current element se chhota milta hai to minPos update karo
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
    
            // Inner loop ke baad minPos mein sabse chhota element ka index hoga
            // Ab usko current position (i) ke saath swap karo
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void InsertionSort(int arr[]) {
        for(int i = 1 ; i < arr.length ; i++){ // 1 elem sorted manlo loop second elem s strt kro
            int curr = arr[i]; // curr = second elem at idx 1
            int prev = i  - 1; // prev hogya 1st elem 0th index wala
            while(prev >= 0 && arr[prev] > curr){ // arr[0] > second elem if yes then 
                arr[prev + 1] = arr[prev]; // arr[1] = arr[0]
                prev--; // prev = 1-1 = 0 
            }
            arr[prev + 1] = curr; // arr[0] = second elem at 1st idx yani arr[0] = curr
        }
    }
    public static void CountingSort(int arr[]) {
        // finding max elem 
        int largest = Integer.MIN_VALUE;
        for(int i= 0 ; i < arr.length ; i++){
            largest = Math.max(largest, arr[i]);
        }
        // creating count arr for counting the freq of the num
        int count[] = new int[largest + 1];// hmesha largest + 1 hoga kyunki 0 se start hoga or 0 empty rhega
        for(int i = 0; i < arr.length ; i++){
            count[arr[i]]++; // count[arr[i]]++; // current element ka value count array ka index hai → us index par +1 karo
        }

        //sorting
        int j = 0; // yeh naya index hai sorted array ko fill karne ke liye, start zero se hoga
        for (int i = 0; i < count.length; i++) { 
            while (count[i] > 0) { // 0 means ek b num nahi aya ya 0 times aya hai 
                arr[j] = i; // us number ko sorted array mein daal do
                j++; // agla index ready karo
                count[i]--; // ek baar daal diya to count kam karo
            }
          }
        }
    public static void Print(int arr[]) {
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // BubbleSort(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        CountingSort(arr);
        Print(arr);
    }
}
