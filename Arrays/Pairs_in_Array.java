// Pairs in an Array : 

// Q - Print the Pairs of the array

// formula for tp = n(n-1)/2 for n elements = 5(5-1)/2 = 10 pairs 

// Input = {2,4,6,8,10};
// Output = (2,4)(2,6)(2,8)(2,10)
//          (4,6)(4,8)(4,10)        totl no of pairs = 10
//          (6,8)(6,10)
//          (8,10)


// LOGIC - 2 loop banayenge , outer m i = 0 till numb.length , uske andr curr krkr ek int bnaynge jo store krega curr num ko
// - inner loop mai j = i+1 krdenge kyuki 2 k bad wale k pairs banane hai , fir print kra denge
// - total nos of pairs bhi print kra denge , jo hr inner loop k print hone k bad ++ hojayega 

// Time Complexity = 0(n*2)

package Arrays;

public class Pairs_in_Array {
    public static void PairArr(int number[]) {
        int tp = 0; // total pairs
        for(int i = 0; i < number.length ; i++){
            int curr = number[i]; // curr val store = 2,4,6,8,10
            for(int j = i+1; j < number.length ; j++){ // i+1 = 1th index fir uske bad j++ pr 2 index..
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;   // print hone k bad total pairs bdhega 
            }
            System.out.println();
        }
        System.out.println("Total Pairs = " + tp);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        PairArr(numbers);

    }
}
