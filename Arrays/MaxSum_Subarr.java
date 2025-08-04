//  MaxSum SubArray in Array :              Solved By :-PREFIX SUM

// Input = {1,-2,6,-1,3};
// Output = 
// it is the max sum = 8
// it is the min sum = -1%   


// LOGIC - Prefix array banate hain taaki har subarray ka sum fast nikal sake.
//         prefix[i] = prefix[i -1] + numbers[i]
//         2 loops se sab possible subarrays check karte hain (start to end)
//         Subarray sum = prefix[end] - prefix[start - 1] (agar start > 0), warna prefix[end]
//         Har subarray sum se MaxSum aur MinSum update karte hain
//         End me dono values print kar dete hain 

// Time Complexity = 0(n2) kyuki 2 loop chlre hai (OKISH Timecomplexity)
package Arrays;

public class MaxSum_Subarr {
    public static void Sum(int numbers[]) {
        int CurrSum = 0; // checking for max min values 
        int MaxSum = Integer.MIN_VALUE;
        int MinSum = Integer.MAX_VALUE;
        int prefix[] = new int[numbers.length]; //  nai array banane k liye of size = numbers.length

        prefix[0] = numbers[0]; // idx = 0 pr prefix ke numbers of idx= 0 ki val hogi
        // calculate prefix array
        for(int i =1 ; i < numbers.length ; i++){
            prefix[i] = prefix[i - 1] + numbers[i]; // is loop ko numbers[i] ka access milta hai kyunki numbers[] already defined hai.
        }

        for(int i = 0; i < numbers.length ; i++){
            int start = i;
            for(int j = i + 1 ; j < numbers.length ; j++){
                int end = j;
                CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; // prefix[end] kyuki 0 to 2 idx -1,2,6 ka sum 5 ha or prefix arr mai 2 idx pr 5 hi hai joki end hai 

                    if (MaxSum < CurrSum) {
                        MaxSum = CurrSum;
                    }
                    if (MinSum > CurrSum) {
                        MinSum = CurrSum;
                    }
            }
        }
        System.out.print("it is the max sum = " + MaxSum);
        System.out.println();
        System.out.print("it is the min sum = " + MinSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        Sum(numbers);
    }
}
