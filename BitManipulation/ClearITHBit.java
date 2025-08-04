// logic - n = 00001010 , bitmask =  1<<i lekin is bar iska ulta like 1<<i nikalne k bad jo 0 hai usko 1 krdo and 1 ko 0 
// 1<<i = 00000100 , isko ulta krne pr 11111011 aayega, fir n or bitmask ka & AND operator lagao jisme 1,1 = 1 rest = 0
// 00001010 & 11111101 = 00001000 as 1,1 = 1 rest 0 in & AND OPERATOR

// Kaam: n ka i-th bit ko force se 0 bana deta hai — baaki sab safe.
// Kaise: n & ~(1 << i)

package BitManipulation; // i = konse idx pr change krna hai tumne 

public class ClearITHBit {
    public static int ClrIthBit(int n , int i) {
        int bitMask = ~(1 << i);
        return n & bitMask; // Use the AND operation to clear the i-th bit
    }
    public static void main(String[] args) { // for 10 = 00001010 , 1 << 1 = 00000010 and ~(00000010) = (11111101)
        System.out.println(ClrIthBit(10, 1)); // not(~) reverse kr deta hai 0-1 , 1 ko 0 
        // fir n or bitmask ka & = & - (1,1) = 1 rest 0 so 00001010 & 11111101 = 00001000
        // 00001010
        // 11111101 = 00001000 = 8 in decimal and output is also = 8 
    }
}
