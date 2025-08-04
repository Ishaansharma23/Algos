<!-- // ye input ko store krta hai or terminal pr wapas hme deta hai jo bhi humne input mai likha hota hai 
// import java.util.*;

// public class Java{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         // String input = sc.next();
//         // System.out.println(input);

//         String name = sc.nextLine();
//         System.out.println(name);
//     }
// }

// isme user input dera hai hum use sum krkr dere hai + add kr rhe hai 

// import java.util.*;

// public class Java{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// hum isme product nikal rhe hai 2 num ka 

// import java.util.*;

// public class Java{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int Product = a*b;
//         System.out.println(Product);
//     }
// }

// calculate area of a circle

// import java.util.*;

// public class Java{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         Float r = sc.nextFloat();
//         Float area = 3.14f * r * r;
//         System.out.println(area);
//     }
// }

// implicit / type conversion / widening func  ----

// int a = 25;  inme conversion hojayega lekin kyuki int ki space long s choti hai lekin agr ulta kre to nahi hoga loss hojayega data 
// long b = a;


// float number = sc.nextInt() ye chl jayega iska input 16 daloge to output 16.0 ayega lekin agr int number = sc.nextFloat() kroge to error ajayga

// type casting / explicit func / narrowing func ---

// isme kya hota hai data loss hone k bad bhi we want ki float int mai convert hojaye even we know data ka loss hoga 

// float num = 20.12f; -  isme .12 wala part loss hojayega sirf 20 store hoga as int
// int b = (int)num

// CHAR (CHARACTERS) CAN BE CONVERTED INTO NUMBERS OR INT --

// char ch = 'a';   'c', 'd' , 'e' --- 99,100,101 and so onn +1 badhta jata hai 
// int num = ch;
// System.out.println(num)         output = 97 


 // char ch2 = 'b';
 // int num2 = ch2;
 // system.out.println(num2)            output = 98


//Type promotion -- Java automatically byte short or char ko int mai convert krdeta hai jab bhi hum operation krte hai (+,-,/,*)

// import java.util.*;

// public class Java{
//     public static void main(String args[]){
//         char a = 'a';
//         char b = 'b';
//         System.out.println(b-a);     output  = 1 (98 - 97)
//     }
//   }

// 2 type promotion -- agr ek bhi expression long ,  double , ya float hai to pura expression float , long, double mai convert hojata hai 

// import java.util.*;

// public class Java{
//     public static void main(String args[]){
//         long a = 12;
//         int b = 22;
//         float c = 14.23f;
//         double d = 8;
//         double ans = a + b + c + d;
//         System.out.println(ans);    
//     }
//   }

// *** TYPE PROMOTION 1 - CHOTE CHOTE DATATYPES KO INT MAI CHANGE KRDETA HAI 
// 2 - BDE BDE DATATYPES KO SBSE BDE DOUBLE MAI CHANGE KR DETA HAI ONLY IN EXPRESSIONS (+/)

// import java.util.*;

// public class Java{
//     public static void main(String args[]){
//       byte a = 12;
//       byte b = (byte) (a * 2);    - output ko jaise taise krke byte mai ghusana hai 
//       System.out.println(b);  
//     }
//   }

// ques - --- - - - - 
// Question1:In a program,input 3 numbers A,B and C.You have to output the average of these 3 numb

// import java.util.*;

// public class Java{
//     public static void main(String args[]){      input - 2 ,4 ,6 output -4
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int sum = a + b + c;
//         int avg = sum / 3;
//         System.out.println(avg);

//     }
// }

// Question 2 :In a program,input the side of a square.You have to output the area of the square

// import java.util.*;

// public class Java{
//     public static void main(String args[]){    input - 4.4 , 4.4 output - 19.36 
//         Scanner sc = new Scanner(System.in);
//        Float side1 = sc.nextFloat();
//        Float side2 = sc.nextFloat();
//        Float output = side1 * side2;
//        System.out.println(output);

//     }
// }

// Question 3 : Enter cost of 3items from the user(using float datatype)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill

// import java.util.*;

// public class Java{
//     public static void main(String args[]){   input 23.78 , 66.12 , 91 output - 180.9
//         Scanner sc = new Scanner(System.in);
//         Float pencil = sc.nextFloat();
//         Float pen = sc.nextFloat();
//         Float eraser = sc.nextFloat();
//         Float bill = pencil + pen + eraser ; 
//         System.out.println(bill);

//     }
// }

// after 18 % gst tax on these items 

// import java.util.*;

// public class Java{
//     public static void main(String args[]){   
//         Scanner sc = new Scanner(System.in);    input 11.34, 34.66,98.9 output - 170.98201 
//         Float pencil = sc.nextFloat();
//         Float pen = sc.nextFloat();
//         Float eraser = sc.nextFloat();
//         Float total =  pencil + eraser + pen ; 
//         Float taxbill = total * 0.18f;
//         Float bill = total + taxbill;
//         System.out.println(bill);

//     }
// }

// Question 4:What will be the type of result in thefollowing Java code

// import java.util.*;

// public class Java{
//     public static void main(String args[]){         output - -51155.08479862671
//         byte b = 4;
//         char c = 'a';
//         short s = 512;
//         int i = 1000;
//         float f = 3.14f;
//         double d = 99.9954;

//         double res = (f * b) + ( i % c) - (d * s);
//         System.out.println(res);
//     }
// } -->