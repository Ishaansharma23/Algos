// binary Left Shift - ye binary num ko shift kr deta hai left ki taraf 
// 000101 << 2 toh pehle 2 zero htt jayenge 010100 peche add hojayenge 
// isme spaces utni hi rhegi num k htne k bad bhi lekin bs 0 add kr denge last mai to fill the empty spaces


package BitManipulation;

public class BinaryLeftShift {
    public static void main(String[] args) {
        // a << b           -- << ye left side point kr rha hai means binary left shift hai 
        // a = 000101 (5 in decimal)
        // b = 2 , toh a << b = 2 spaces s age shift ho = 010100 now 
        // 5 << 2 = (10100)2 - in binary 

        // in decimal = 0*2^0 + 0*2^1 + 1*2^2 + 0*2^3 + 1*2^4 = 4 + 16 = 20
    // *  // fast formula = a << b = a * 2^b
    // 5*2^2 = 5*4 = 20

    System.out.println(5 << 2); // Output: 20
    
    }
}
