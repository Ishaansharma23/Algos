// Rules
// 0 ^ 0 = 0
// 0 ^ 1 = 1
// 1 ^ 0 = 1
// 1 ^ 1 = 0

package BitManipulation;

public class BinaryXOR {
    public static void main(String[] args) {
        // binary XOR 
        System.out.println(5 ^ 6);
        // 5 in binary = 101
        // 6 in binary = 110
        // so 101 ^ 110 = start from right = 1 ^ 0 = 1, 0 ^ 1 = 1, 1 ^ 1 = 0
        // result = start from left = 011
        // so 5 ^ 6 = 3
    }
}
