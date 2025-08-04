// logic - Agar last bit (LSB) 0 hai → number even.
// Agar last bit (LSB) 1 hai → number odd. , 2 = 10, 3 = 11 so 2 lsb = most right side = 0 which is even and in 3 = 1 its odd 

// why only 1 = 1 hi perfect hai, kyunki ,Sirf last bit pe 1 hai. 00000001 baki sbme nahi hai last mai 1 
// Agar tumhe sirf last bit check karni hai, = 1 

package BitManipulation;

public class OddEven {
    public static void OddorEven(int n) {
        int bitMask = 1; // 0001 in binary, this is the bit mask to check the last bit
        if ((n & bitMask) == 0) { // If the last bit is 0, then n is even
            System.out.println("Even");
        } else { // If the last bit is 1, then n is odd
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        OddorEven(3); //odd - 3 = 11 , 1 = 01 so 0,1 = 0 and 1,1 = 1 hence 1 is odd lsb is odd so num is odd 
        OddorEven(5); //odd
        OddorEven(10); // even
    }
}
