// Did revised the concepts

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

    public static void PrefixArrSum(int arr[]) { // prefix sum 
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

   public static void KadanesSubArrSum(int arr[]) { // kadanes sub array sum
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

   public static void TrappedRainwater(int arr[]) {
    // left max banao
    int leftmax[] = new int[arr.length];
    leftmax[0] = arr[0];
    for(int i = 1 ; i < arr.length; i++){
        leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
    }

    // right max banao
    int rightmax[] = new int[arr.length];
    rightmax[arr.length - 1] = arr[arr.length - 1];
    for(int i = arr.length - 2 ; i >= 0; i--){
        rightmax[i] = Math.max(arr[i], rightmax[i + 1 ]);
    }

    // ab trapped water = height - waterlvl (min(leftmax, rightmax))
    int trappedWater = 0;
    for(int i = 0; i < arr.length ; i++ ){
        int waterlvl = Math.min(leftmax[i], rightmax[i]); // kitna pani bhara hai 
        // jitna pani bhara hai uss s jo arr ki height hai use minus krdia fir trapped water niklega
        trappedWater += waterlvl - arr[i];
    }

    System.out.println(trappedWater);   // ans 0 isliye ara kyuki increasing order hai pani tik hi nahi skta 
   }

   public static void BuySellStocks(int arr[]) {
    
    int buyPrice = Integer.MAX_VALUE; // sbse km rkhni hai humne buyprice
    int maxProfit = 0; // max profit of the day
    
    for(int i = 0; i < arr.length ; i++){
        if (buyPrice < arr[i]) { // to profit niklega
            int profit = arr[i] - buyPrice; // profit = selling price - buyprice
            maxProfit = Math.max(maxProfit, profit); // ye overall profit nahi nikal rhi ek specific din ka pura profit max 
        }else{
            buyPrice = arr[i];
        }
    }
    System.out.println("the max profit = " + maxProfit);

   }

   public static void BubbleSort(int arr[]) {

    for(int i = 0; i < arr.length; i++){
        int swaps = 0; // hr round k bad ek num/elem apni sahi position pr chala jata hai 
        for(int j = 0; j < arr.length - 1 - i; j++){
            if (arr[j] > arr[j + 1]) { // adjacent compare and push the biggest to the end in every swaps
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swaps++;
            }
        }
        if (swaps == 0) {
            break; // agr ek bhi swap nahi hua to array sorted hai
            
        }
        System.out.println("the times of swaps are " + swaps);
    }
    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();

   }

   public static void SelectionSort(int arr[]) {

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
    
   public static void InsertionSort(int arr[]) {

    for(int i = 1; i < arr.length; i++){       // i = 1 se start (pehla element already sorted maan lo)
        int curr = arr[i];                     // curr = jo element insert karna hai
        int prev = i - 1;                      // prev = uske pehle ka index

        // piche ke elements check karte raho jab tak curr se bade hain
        while(prev >= 0 && arr[prev] > curr) {
            arr[prev + 1] = arr[prev];         // bade element ko ek step right shift karo
            prev--;                            // aur pichhe chale jao
        }

        arr[prev + 1] = curr;                  // khali jagah mil gayi → curr insert kar do
    }
}


    public static void main(String[] args) {
        int arr[] = {5,4,1,3,7,2};
        int key = 10;
        // Largest(arr);
        // BinSearch(arr, key);
        // RevArr(arr);
        // Pairs(arr);
        // PrintSubArr(arr);
        // SubArrSum(arr);
        // PrefixArrSum(arr);
        // KadanesSubArrSum(arr);
        // TrappedRainwater(arr);
        // BuySellStocks(arr);
        // BubbleSort(arr);
        // SelectionSort(arr);
        InsertionSort(arr);
    }
}
