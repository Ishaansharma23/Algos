// Rules = "Binary OR operation"
            // 0 | 0 = 0
            // 0 | 1 = 1
            // 1 | 0 = 1
            // 1 | 1 = 1

package BitManipulation;

public class BinaryOR {
    public static void main(String[] args) {
        // Binary OR operation 

        System.out.println(5 | 6); // 7 ayega in decimal 
        // 5 in binary = 101 , 6 in binary = 110
        // so 101 | 110 = start from right = 1 | 0 = 1, 0 | 1 = 1, 1 | 1 = 1
        // result = start from left = 111
        // so 5 | 6 = (7)10

    }
}
