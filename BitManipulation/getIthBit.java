            // whhy only use 1 not 2,3... 3 mai toh two 1 bits hoti hai isliue nhi lete 
// Jab bit position exact chahiye hoti hai, to 1 hamesha safe hai.
// 2 se bhi kabhi kabhi perfect hota hai, but general mask banane mein confusion hoti hai.
// 1 << i means: 0 se i-th bit pe ON karo
// 2 << i means: 2nd bit se i-bit aur shift karo → to position shift galat ho sakti hai.

// logic - n = jo decimal num hoga into binary then bitmask def krenge = 1 << i = 1 ko left shift krna hai i places pr
// fir if n and bitmask joki 1 in bin ko i places shift krne k bad ayega unka & AND lelenge if 1 comes under 1 = 1 BIT agr nahi ata toh 0 BIT

// Kaam: Dekhta hai ki n ka i-th bit 1 hai ya 0.
// Kaise: n & (1 << i) ➝ Agar != 0 to ON, warna OFF.
package BitManipulation;  // i = konse idx pr change krna hai tumne 

public class getIthBit {
    public static int IthBit(int n, int i) { // for i = 2 
        int bitMask = 1 << i; // Create a bitmask with the i-th bit set to 1, and i left shifts 1 by i places

        if ((n & bitMask) == 0) { //    00001010 = 10 in binary, 1 << i(2) = 00000100
            return 0; // If the i-th bit is 0 ; -- 00001010
                                                // 00000100 = 00000000 = ans = 0 BIT
        } else {
            return 1; // If the i-th bit is 1
            
        }
    }
    public static void main(String[] args) {
        System.out.println(IthBit(10 , 3)); // 00001000 = 1 << 3 
                                        // 10 =    00001010 = 00001000 = 1 BIT
    }
}
