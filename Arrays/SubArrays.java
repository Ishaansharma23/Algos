//SubArray in Array : 

// printing the Subarray of the Array

// Input = {2,4,6,8,10};
// Output =
// 2 
// 2 4 
// 2 4 6 
// 2 4 6 8 
// 2 4 6 8 10 

// 4 
// 4 6 
// 4 6 8 
// 4 6 8 10 

// 6 
// 6 8 
// 6 8 10 

// 8 
// 8 10 

// 10 

// LOGIC -  3 loop bnenge, ek outerloop jo store krega start = pehla num , fir ek inner loop jo i s start hoga kyuki hume 2 bhi chahiye 
// - 3 loop print krega num ko start s end tk (2,4,6) (2,4,6,8)

// Time Complexity = O(log n)

package Arrays;

public class SubArrays {

    public static void SubArr(int numbers[]) {
        int totalSubArrays = 0;
        for(int i = 0; i < numbers.length ; i++){ // ye hold krega start ki val ko jaise 2 
            int start = i;
            for(int j = i ; j < numbers.length ; j++){ //  ye hold krega end val 4,6,8,10
                int end = j;
                for(int k = start ; k <= end; k++){ // k start i s hoga yani 2 s or jayega j tk yani , 4 fir to 6
                    System.out.print(numbers[k] + " "); // k ko print krenge to wo index dega we need numbers
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays are =" + totalSubArrays);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        SubArr(numbers);
    }
}
