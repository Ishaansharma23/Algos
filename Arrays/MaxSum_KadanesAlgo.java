//  MaxSum SubArray in Array :              Solved By :- KADANES ALGORITHM

// Input = {-2,-3,4,-1,-2,1,5,-3};
// Output = 
// it is the max sum = 7

// LOGIC - 1 loop chalega jisme , CurrSum current subarray ka sum track karta hai.
//         Agar CurrSum negative ho jata hai, to usse 0 reset kar dete hain (kyunki negative sum se future subarray kharab hoga).
//         Har step par CurrSum ko MaxSum ke saath compare karte hain aur agar CurrSum zyada hai to MaxSum ko update kar dete hain.
//         MaxSum hamesha ab tak ka maximum continuous subarray sum store karta hai.
//         End mein, MaxSum ko print kiya jata hai 


// // Time Complexity = 0(n) kyuki 1 loop chlre hai (good Timecomplexity)

package Arrays;

public class MaxSum_KadanesAlgo {
    public static void Kadanes(int numbers[]) {
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length ; i++){
             CurrSum = CurrSum + numbers[i]; // curr sum mai add krdo jo bhi index pr no hai
            if (CurrSum < 0) {
                CurrSum = 0;
            }
            MaxSum = Math.max(MaxSum, CurrSum); // checks maxsum bda hai ya currsum jo bhi bda hai use MaxSum mai store krta hai 
        }
        System.out.print("Our Max Sum = " + MaxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        Kadanes(numbers);
    }
}

// output = -1

// logic - negative numbers jo hai arr mai unka max sum nikal lo 

// package Arrays;

// public class MaxSum_KadanesAlgo {
//     public static void Kadanes(int numbers[]) {
//         int curr = 0;
//         int maxsum = Integer.MIN_VALUE;
//         for(int i = 0; i < numbers.length ; i++){
//             if (numbers[i] < 0) {
//                 curr = curr + numbers[i];
//             }
//             maxsum = Math.max(maxsum, curr);
//         }
//         System.out.print("this it the Maximum sum = " + maxsum);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {-1,-2,-3,-4};
//         Kadanes(numbers);
//     }
// }
