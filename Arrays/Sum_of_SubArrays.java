//SubArray in Array :              Solved By :- BRUTE FORCE 

// printing the sum of Subarray of the Array

// Input = {1,-2,6,-1,3};
// Output = 
// it is the max sum = 8
// it is the min sum = -1%   


// LOGIC -  Har possible subarray generate kar raha hai (i se j tak).
//          Har subarray ka sum calculate kar raha hai (sum += numbers[k]).
//          Us sum ko check kar raha hai:
//          Kya ye ab tak ka Max hai? → MaxSum = sum
//          Kya ye ab tak ka Min hai? → MinSum = sum
//          Last mein MaxSum aur MinSum print ho rahe hain.

// Time Complexity = 0(n3) kyuki 3 loop chlre hai (bad Timecomplexity)


package Arrays;

public class Sum_of_SubArrays {
    public static void Sum(int numbers[]) {
        int MaxSum = Integer.MIN_VALUE;
        int MinSum = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length ; i++){
            int start = i;
            for(int j = i + 1 ; j < numbers.length ; j++){
                int end = j;
                int sum = 0;
                for(int k = start ; k <= end ; k++){ 
                     sum += numbers[k];
                    }
                    if (MaxSum < sum) {
                        MaxSum = sum;
                    }
                    if (MinSum > sum) {
                        MinSum = sum;
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
