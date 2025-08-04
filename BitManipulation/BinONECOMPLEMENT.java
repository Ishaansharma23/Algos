// Also known as NOT operation

// it works on 1 operator only not 2 

// RULE - ~0 = 1 , ~1 = 0

// there r two thing in this 00000101 = right most = least significant bit , left most = most significant bit
// most significant bit -  tells us ki hum positive num ki baat kr rhe hai ya negative 0 - (+) , 1- (-neg)
// pehle not nikalenge num ka fir waps 2s complement mai 1s nikalenge like not of the result jo (not aya th)
// fir wo same pehle jaise hojayega usme hum fir + 1 kr denge (1s compl gives magnitude)

// ~5 = -6(10)  as ~5 ka pehle not nikalenge to 11111010 ayega to msb 1 hai to negative num ayega ans 
// fir 11111010 iska 1s complement nikalenge to 00000101 ayega fir + 1 kr denge to 00000110 ayega = 6(10) 
// 1st complement 1 tha msb to -6(10) hojayega ans 

package BitManipulation;

public class BinONECOMPLEMENT {
    public static void main(String[] args) { // 8 bit hote hai 
        // ~5 = NOT Operator
        // 5 in binary = 101
        // NOT ~5 = 010
        System.out.println(~5); 
        // ~5 =pehle 5 ka not nikala = 00000010 - 1s complement = 00000101 - 2s complement add(+1) = 00000101 + 1 = 00000110 
        // as 1 + 1 = 2 in binary 2 = 10 in binary to ek age hasil chala gya 
    }
}
