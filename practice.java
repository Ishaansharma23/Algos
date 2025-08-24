public class practice {
    public static void Largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length ; i++){
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];       
            }
        }
        System.out.println("largest = " + largest);
        System.out.println("Smallest = " + smallest);

    }

    public static void BinSearch(int arr[] , int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid =  (start + end) / 2;
            if (arr[mid] < key) {
                start = mid + 1; // key right side par hai
            } else if (arr[mid] > key) {
                end = mid - 1; // key left side par hai
            } else {
                System.out.println("Key found at index: " + mid);
                return; // key mil gaya
            }
        }
    }

    public static void RevArr(int arr[]) {
      int first = 0;
      int last = arr.length - 1;

      while (first < last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        first++;
        last--;
      }

      for(int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();
    }

    public static void Pairs(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1 ; j < arr.length; j++){
                System.out.println(arr[i] +  "," + arr[j]);
            }
            System.out.println();
        }
       
    }

    public static void PrintSubArr(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i ; j < arr.length; j++){
                System.out.println(arr[i] + "," +  arr[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        // Largest(arr);
        // BinSearch(arr, key);
        // RevArr(arr);
        // Pairs(arr);
        PrintSubArr(arr);
    }
}
