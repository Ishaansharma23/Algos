// Largest Number in Array : 

// Q - Find the Largest number in the given Array 

// Input = {1,2,6,3,5};
// Output = largest = 6 , smallest = 1

// LOGIC -  Shuruaat mein largest = -infinity 
//       → Taaki koi bhi number aaye, wo isse bada ho, aur update ho sake.
//      Step 2: smallest = +infinity 
//      → Taaki koi bhi number aaye, wo isse chhota ho, aur update ho sake.
//      Step 3: Har element ko loop mein check karte hain:
//      - largest jo hai wo chota hona chahiye input s toh largest < numbers[i]
//      - smallest jo hai wo sbse bda hona chaiye input s to smallest > numbers[i]

// Time Complexity = O(n)


package Arrays;

public class LargestNumber_in_Array {
    public static int LargestNum(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinty
        int smallest = Integer.MAX_VALUE; // +infinty
        for(int i = 0; i < numbers.length; i++){
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest number = " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println(LargestNum(numbers));
    }
}
