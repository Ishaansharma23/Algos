                // Main RULE 
                // Binary AND (&) 
                // 0 & 0 = 0
                // 0 & 1 = 0
                // 1 & 0 = 0
                // 1 & 1 = 1

package BitManipulation;

public class BinaryAND {
    public static void main(String[] args) { // & is called ampersand
        // Binary AND operation
        int a = 5;
        int b = 3;

        System.out.println(a & b); // && is used in for condition and 

        // a in binary = 101 , b in binary = 011
        // so 101 & 011 = start from right = 1 & 1 = 1, 0 & 1 = 0, 1 & 0 = 0 
        // result =  strt from left = 001 
        // so 5 & 3 = 1
    }
}
