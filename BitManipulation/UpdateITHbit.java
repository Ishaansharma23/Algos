// package BitManipulation;

// public class UpdateITHbit {
//     public static int UpdateBit(int n , int i , int newBit) { // i = konse idx pr change krna hai tumne 
//         // if (newBit == 0) {
//         //     return clearBit ; 
//         // }else {
//         //     return setIthbit;
//         // } 

//         // or better 

//         // int n = clearIthBit(n, i); // n ko clearIthbit s clear krdia means 1 << 2 means 2 idx pr 0 krdia 
//         // int bitMask = newBit<<i;   // bit mask =  new bit jo thi jaise hme 0 set krna tha that was new bit toh bitmask =  newbit(0) << 2 = 0000
//         // return n | bitMask;        // 1001 | 0000 = 1001 , as OR mai 0,0 = 0 baki sb 1 
//     }
//     public static void main(String[] args) {
        
//     }
// }

    // n = 14 , i =1 , toh n = 1110, 1 << 1 = 0010 then NOT(~) = ~(1 << 1) = 1101, = clearithbit process
    // 1110 & 1101 = 1100 ans = 12 ab n bn gya 12 -- n = 12; 
    // int bitmask = newbit << i (newbit = 0, 0000 << 1)