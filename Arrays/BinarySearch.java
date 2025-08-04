//Binary Search in Array : 

// finding the index of a given key in a sorted array using binary search.

// Input = {2,4,6,8,10,12,14};
// Output = the index for our key is = 4

// LOGIC -  numbers array k andr hmesha increasing ya desc order mai hone chahiye (sorted)
// - loop start<=end chalega kyuki start hmesha end s chota hona chahiye ya to jo strt hai wahi end ho
// - pehle start or end point lelo = o , numbers.length-1 - fir mid point nikalo 
// - fir check kro if else laga kr ki mid < = > key jo hota hai fir age or chote krte jao array ko 
// - isme ans hmesha mid hi ayega not the end or start 
//  agr key nahi hui to -1 return kr denge

// Time Complexity = O(log n)


package Arrays;

public class BinarySearch {
    public static int BinSearch(int numbers[] , int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {    // Jab tak start <= end hai, tab tak search area valid hai.
            int mid = (start + end) / 2;    // isme hum index divide kr rhe hai naki number

            System.out.println("start" + start + "end" + end + "mid" + mid + "value" + numbers[mid]); // debugging

            if (numbers[mid] == key) {  
                return mid;
            }
            if (numbers[mid] < key) { // right side
                start = mid +1;     // right side krne k liye mid + 1 kr denge (strt 10 hojayega 8 s)
            }else{  // left side 
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("the index for our key is = " + BinSearch(numbers, key));
    }
}
