// Linear Search in Array : 

// Q - Find the index of element in the given Array 

// Input = {2,3,4,5,7,9,10,12,13,15,17}
// Output = Key is at The Index = 9 

// LOGIC - Array ke har element ko ek-ek karke check karta hai.
//       - Agar element key ke barabar milta hai, to uska index return kar deta hai.
//       - Agar end tak nahi mila to -1 return karta hai.

// Time Complexity = O(n) , loop mai tym laga hume - 0 to n operation kre humne , n = arr.length

package Arrays;

public class LinearSearch {
    public static int LinSearch(int numbers[] , int key){
        for(int i = 0 ; i < numbers.length ; i++){
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,3,4,5,7,9,10,12,13,15,17};
        int key = 15;

        int index = LinSearch(numbers, key);

        if (index == -1) {
            System.out.print("NOT FOUND");
        }else{
            System.out.println("Key is at The Index = " + index);
        }
    }
}


