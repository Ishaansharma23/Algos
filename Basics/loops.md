<!-- print number from 1 to 10

// public class Java {

//     public static void main(String args[]){
//         int num = 0;
//         while (num <= 10) {
//             System.out.println(num);
//             num++;
//         }
//     }
// }

// print number from 1 to n  ---n user dega

// import java.util.*;

// public class Java {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = 1;
//         int n = sc.nextInt();
//         while (num <= n) {
//             System.out.println(num);
//             num++;  
//         } 
//         System.out.println("Printed Numbers as per Your Input " + n);
//     }
// }

// print sum of first n natural number

// import java.util.Scanner;

// public class Java {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int num = 1;
//         while (num <= n) {
//             sum += num;
//             num++;
//         }
//         System.out.println(sum);

//     }
// }

// print square pattern

// import java.util.*;

// public class Java {

//     public static void main(String args[]){
//         int n = 4;
//         for(int i = 1 ; i <= n; i++){
//             System.out.println("****");
//         }
//         System.out.println("the times of printed " + n);
//     }
// }
//             while loop se

// import java.util.*;

// public class Java {

//     public static void main(String args[]){
//         int n = 4;
//         int i = 1;
//       while (i <= n) {
//         System.out.println("****");
//         i++;
//       }
//       System.out.println("how many times * is printed");
//     }
// }

// print reverse of a number

// import java.util.Scanner;

// public class Java {

//     public static void main(String agrs[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         while (n > 0) {
//             int lastDigit = n%10;
//             System.out.println(lastDigit);
//             n /= 10;
//         }
//     }
// }

//  reverse of a number

// import java.util.*;

// public class Java {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int rev = 0;
//         while (n > 0) {
//             int lastDigit = n%10;
//             rev = (rev*10) + lastDigit;
//             n/=10;
//         }
//         System.out.println(rev);
//     }
// }


// keep entering no tilluser enters mutliple of 10

// import java.util.*;

// public class Java {

//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);

//         while (true) {
//             System.out.println("Enter Your Number");
//             int number = sc.nextInt();
//             if (number % 10 ==0) {
//                 break;
//             }else{
//                 System.out.println(number);
//             }
//         }
//       }
//     }

//         or do while se

// import java.util.*;

// public class Java {

//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//         do {
//             int number = sc.nextInt();
//             if (number % 10 ==0) {
//                 break;
//             }
//         } while (true);
//         }
//       }
 

// display all users except multiple of 10

// import java.util.*;

// public class Java {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Number");
//         while (true) {
//             int num = sc.nextInt();
//             if (num % 10 == 0) {
//                 continue;
//             }else {
//                 System.out.println(num);
//             }
//         }
//     }
// }

// check if a number is prime or not 

// import java.util.*;

// public class Java {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your number");
//         int n = sc.nextInt();
//         boolean Prime = true;
//         // for(int i = 2 ; i <= n ; i++){
//         for(int i = 2; i <= Math.sqrt(n); i++){
//             if (n%i ==0) {
//                 Prime = false;
//                 break;
//             }
//         }
//         if (Prime) {
//             System.out.println(n + "is a Prime Number");
//         }else {
//              System.out.println(n + "is Not a Prime Number");
//         }
//     }
// }

// is code ko or optimize krne k liye i < n-1 ki jagah underroott n krdo 


// Question2:Write a program that reads a  set of integers,and then prints the sum of the even and odd integers

// import java.util.*;

// public class Java {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter numbers (0 to stop):");
//         int evenSum = 0; 
//         int oddSum = 0;  
//         while (true) {
//             int input = sc.nextInt();
//             if (input == 0) {
//                 break;
//             }
//             if (input % 2 == 0) {
//                 System.out.println(input + " is an even number");
//                 evenSum += input;
//             } else {
//                 System.out.println(input + " is an odd number");
//                 oddSum += input;
//             }
//         }
//         System.out.println("Sum of even numbers: " + evenSum);
//         System.out.println("Sum of odd numbers: " + oddSum);
//         sc.close(); // Close Scanner
//     }
// }

// Write a program to find the factorial of any number entered by the user

// import java.util.*;

// public class Java {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your number");
//         int n = sc.nextInt();
//         int factorial = 1;
//         for(int i = 1; i <= n ; i++){
//             factorial *= i;
//         }
//     System.out.println("factorial : " + factorial);
//     }
// }

// Write a program to print the multiplication table of a numberN,entered by the user

// import java.util.*;

// public class Java {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your number");
//         int n = sc.nextInt();
//         int multiplication = 0;
//         for(int i = 1 ; i <= 10 ; i++){
//             multiplication = n * i ;
//             System.out.println(n + "*" + i + "=" + multiplication);
//         }
        
//     }
// } -->

