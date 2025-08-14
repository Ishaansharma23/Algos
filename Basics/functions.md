<!-- // Calculate Sum of 2 Numbers

// import java.util.*;

// public class Java {
//     public static int calculateSum(int num , int num2 ){
//        int sum = num + num2;
//        return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a , b);
//         System.out.println(sum);
//         }
//     }



// Find Product of A and B

// import java.util.*;

// public class Java {
//     public static int Multiply(int a , int b){
//         int multiply = a * b;
//         return multiply;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter First Number");
//         int a = sc.nextInt();
//         System.out.println("Enter Second Number");
//         int b = sc.nextInt();
//         int Result = Multiply(a, b);
//         System.out.println(Result);


//     }
// }

// Find Factorial of a number n 

// import java.util.*;

// public class Java {
//     public static int Factorial(int n){
//         int f =1;
//         for(int i = 1; i<=n ; i++){
//             f *= i;
//         }
//         return f;
      
//     }

//     public static void main(String args[]){
//         int res = Factorial(2);
//         System.out.println(res);
//     }
// }


// //**** Find Binomial Coefficient -- formula = n!/r!(n!-r!)

// import java.util.*;

// public class Java {
//     public static int Factorial(int n){
//         int f =1;
//         for(int i = 1; i<=n ; i++){
//             f *= i;
//         }
//         return f;
      
//     }
//     public static int binCoeff(int n , int r) {
//         int fact_n = Factorial(n);
//         int fact_r = Factorial(r);
//         int fact_nmr = Factorial(n-r);
//         int binCoeff = fact_n / (fact_r * fact_nmr);
//         return binCoeff;
//     }

//     public static void main(String args[]){
//         System.out.println(binCoeff(5, 2));
//     }
// } 


// --** Method Overloading - isme kya hota hai ki same name ka function hota hai or params alag hote hai return type s frk nahi pdta isme params alag hone chahiye nahi to error ajayega

// import java.util.*;

// public class Java {
//     public static int sum(int a , int b){
//      return a + b;
//     }
//     public static Float sum(Float a , Float b) {
//         return a + b;
//     }

//     public static void main(String args[]){
//        int res =  sum(21,29);
//        System.out.println(res);
//        Float res2 = sum(2.2f,8.8f);
//        System.out.println(res2);
//     }
// }


// *&** check if a number is prime or not (not optimized method)
// public class Java {

//     public static Boolean isPrime(int n){
//         if (n == 2) {
//             return true;
//         }
//         for(int i = 2; i<= n-1 ; i++){
//             if (n%i==0) {
//                 System.out.println("this is not prime");
//                 return false;
//             }
//         }
//         System.out.println("this is prime");
//         return true;
//     }
//     public static void main(String args[]){
//       System.out.println(isPrime(8));
//     }
// }

// imp = *$*$*$ check if a number is prime or not (optimized method)

// public class Java {

//     public static Boolean isPrime(int n){
//     //    boolean isPrime = true;
//        if (n == 2) {
//         System.out.println("its a prime number");
//         return true;
//        }
//        for(int i = 2; i < Math.sqrt(n) ; i++){
//         if (n%i == 0) {
//             System.out.println("its not a prime");
//             return false;
//         }
//        }
//        System.out.println("its a prime Number");
//        return true;
//     }
//     public static void main(String args[]){
//         System.out.println(isPrime(5));;
//     }
// }

-*** print Prime number Range like kon kon s no prime hai n tk

package Arrays;

import java.util.*;

public class prac {
    public static Boolean isPrime(int input) {
        if (input <= 1) { // 1 s km hua no to prime nahi h wo 
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(input) ; i++){ // 2 s input tk check kro prime hai ya nahi 
            if (input % i == 0) {
               return false; 
            }
        }
        return true;
    }


    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int input = sc.nextInt();
        
        // ye line print krti hai ki ye input prime hai ya nahi or isPrime method check krta hai prime h ya nahi 

        if (isPrime(input)) { //  ye code sirf input batata hai prime hai ya nahi 
            System.out.println(input + "is a Prime Number");
        }else{
            System.out.println(input + "is not a Prime Number");
        }

        // to print prime number from 2 to input
        // or ye code print krta hai input tk k numbers ko check krke i ko ki prime h ya nahi 
        
        // int count = 0; //  count ki kitne prime numbers h 2 to n k bich
        for(int i = 2; i < input; i++){
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();

    }
}


// **** ---- convert bin to dec or dec to binary

// public class Java {

//     public static int BintoDec(int n) {
//         int decimal = 0;
//         int pow = 0;
//         while (n>0) {
//             int lastDigit = n%10;
//             decimal = decimal + lastDigit * (int)Math.pow(2, pow);
//             pow++;
//             n /= 10;
//         }
//         return decimal;
//     } 
//     public static int DecToBin(int n) {
//         int binary = 0;
//         int pow = 0;
//         while (n>0) {
//             int lastDigit = n%2;
//             binary = binary + lastDigit * (int)Math.pow(10, pow);
//             pow++;
//             n /= 2;
//         }
//         return binary;
//     }
       

//     public static void main(String[] args) {
//         // System.out.println(BintoDec(10101));
//         System.out.println(DecToBin(10));
//     }
// }
                ------------------------------

// public class Java {
// // Write a Java method to compute the averageof three numbers
//     public static int Avg(int a,int b,int c) {
//         int sum = (a+b+c)/3;
//         return sum;
//     }
// // Write a method named i Even that accepts an int argument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod   
//     public static Boolean isEven(int n) {
//         if (n%2==0) {
//             System.out.println(n + "is Even");
//             return true;
//         }
//         System.out.println("its not Even");
//         return false;
//     }
// // Write a Java program to check if a number is a palindrome in Java
//     public static int Reverse(int n) {
//         int Original  = n;
//         int RevNum = 0;
//         while(n > 0){
//             int lastDigit = n%10;
//             System.out.print(lastDigit);
//             RevNum = RevNum * 10 + lastDigit;
//             n /= 10;
//         }
//         if (Original == RevNum) {
//             System.out.println("its a palindrome");
//         }else{
//             System.out.println("its not a palindrome");
//         }
//         return RevNum;
        
//     }
//  // Write a Java method to compute the sum of the digits in an integer
//     public static int CompSum(int n) {
//         int Sum = 0;
//         while (n > 0) {
//             int lastDigit = n % 10;   
//             Sum = Sum + lastDigit;
//             n/=10;
//         }
//         return Sum;
//     }

//     public static void main(String[] args) {
//          // System.out.println(Avg(5, 7, 9));
//         // System.out.println(isEven(6));
//         // System.out.println(Reverse(909));
//         System.out.println(CompSum(123));

//     }
// }


-->
