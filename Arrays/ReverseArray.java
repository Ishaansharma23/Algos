// Reverse in Array : 

// Q - Reverse the array in the given Array itself

// Input = {2,4,6,8,10};
// Output = 10 8 6 4 2 

// LOGIC - swap krna hai nos ko first elem ko last s and vice verca  , loop tbtk chlga jabtk first < last
// - fir swap k bad first++ and last-- krdenge taki next number in array ajaye first s agla wla or last s uske pichle wala
// - fir array print krane k liye loop chala pdega to print numbers[i]

// Time Complexity = O(n) - Array ke half elements ko process karna hota hai, matlab n/2 steps. Par Big-O notation mein, hum constant factors ignore karte hain (jaise n/2 ko sirf O(n) likhte hain).
// Space Complexity = O(1)-  only a single loop runs for n elements and no extra arrays are created

package Arrays;

public class ReverseArray {

    public static void RevArr(int numbers[]) {
        int first = 0 , last = numbers.length -1;
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        RevArr(numbers);
        // print 
        for(int i = 0 ; i < numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
