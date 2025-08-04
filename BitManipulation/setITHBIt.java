// Logic - n = bin num , bitmask =  1 ko leftshift by i places 1<<i , return krenge n OR bitmask means updated n 
// for 10 = 00001010 , 1 << 2 = 00000100 , or = 00001010 | 00000100 = 00001110 , OR = 0,0 pr = 0 hoga sirf baki sb 1 hoga

// Kaam: n ka i-th bit ko 1 bana deta hai — chahe pehle 0 hi kyun na ho.
// Kaise: n | (1 << i)

package BitManipulation; // i = konse idx pr change krna hai tumne 

public class setITHBIt {
    public static int IthBit(int n , int i) {
        int bitMask = 1 << i; // Create a bitmask with the i-th bit set to 1, and i left shifts 1 by i places
        return n | bitMask; // Use the OR operation to set the i-th bit to 1
    }
    public static void main(String[] args) {
        System.out.println(IthBit(10, 2)); // 10 = 00001010 in binary , 1 << 2 = 00000100
        // 00001010 | 00000100 = 00001110 , OR = 0,0 pr = 0 hoga sirf baki sb 1 hoga
    }
}
