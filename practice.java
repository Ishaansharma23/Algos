public class practice {
    public static void Largest(int arr[]) { // find th largest/smallest num in an arr 
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

    public static void BinSearch(int arr[] , int key) { // binary search
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

    public static void RevArr(int arr[]) { // Reverse an array 
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

    public static void PrintSubArr(int arr[]) { // Print SubArrays
        for(int i = 0; i < arr.length; i++){
            for(int j = i ; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void SubArrSum(int arr[]) { // Subarray sum using BRUTE FORCE
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ; i++){
            for(int j = i ; j < arr.length; j++){  
                int sum = 0;
                for(int k = i ; k <= j ; k++){
                    sum = sum + arr[k];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
                System.out.println("Subarray ("+ i + "," + j + ") ka sum = " + sum); 
            }
        }
        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void PrefixArrSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;

        // prefix sum
        int prefix[] = new int[arr.length];
        prefix[0] =  arr[0];
        for(int i = 1; i < arr.length ; i++){
            prefix[i] = prefix[i - 1] + arr[i]; // prefix arr bna li 
        }

        for(int i = 0; i < prefix.length; i++){
            for(int j = i + 1; j < prefix.length; j++){
                int sum = 0;
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1]; 

                if (maxSum < sum) {
                    maxSum = sum;
                    
                }

            }
        }
        System.out.println("Maximum Subarray Sum using Prefix Array = " + maxSum);


    }

   public static void KadanesSubArrSum(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0; i < arr.length;i++){
            currsum = currsum + arr[i];
            if ( currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.print("Our Max Sum = " + maxsum);
   }
    

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        // Largest(arr);
        // BinSearch(arr, key);
        // RevArr(arr);
        // Pairs(arr);
        // PrintSubArr(arr);
        // SubArrSum(arr);
        // PrefixArrSum(arr);
        KadanesSubArrSum(arr);
    }
}
