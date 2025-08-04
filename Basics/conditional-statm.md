<!-- // ternary operator --

// import java.util.*;

// public class Java{
//     public static void main(String args[]){
//     int number = 12;
//     String res = (number%2 == 0) ? "even" : "odd";
//     System.out.println(res);
//     }
// }

// ------ java calculator using Switch()
// import java.util.*;

// public class Java{
//     public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter a :");
//       int a =  sc.nextInt();
//       System.out.println("Enter b :");
//       int b =  sc.nextInt();
//       System.out.println("Enter operator :");
//       char operator = sc.next().charAt(0);

//       switch (operator) {
//         case '+' : System.out.println(a+b);
//             break;
//         case '-' : System.out.println(a-b);
//             break;
//         case '*' : System.out.println(a*b);
//             break;
//         case '/' : System.out.println(a/b);
//             break;
//         default : System.out.println("wrong operator buddy!!");
//       }
//     }
    
// }

// Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative
// import java.util.*;

// public class Java {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if (num % 2 == 0) {
//             System.out.println("it is even" + num);
//         } else { 
//             System.out.println("it is odd" + num);
//         }
//     }
    
// }
// Question2:Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever

// import java.util.*;

// public class Java {
//     public static void main(String args[]){
//        double temp = 103.5;
//        if (temp > 100) {
//         System.out.println("you are having fever");
//        }else { 
//         System.out.println("you dont have fever");
//        }
        
//         }
//     }

// ques 3 Write a Java program to input week number(1-7)and print day of week name using switch case

// import java.util.*;

// public class Java {
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int weekNum = sc.nextInt();
//        if (weekNum >=1 && weekNum <=7) {
//         switch (weekNum) {
//             case 1 : System.out.println("Monday");
//             break;
//             case 2 : System.out.println("tuesday");
//             break;
//             case 3 : System.out.println("wednesay");
//             break;
//             case 4 : System.out.println("thursday");
//             break;
//             case 5 : System.out.println("friday");
//             break;
//             case 6 : System.out.println("saturday");
//             break;
//             case 7 : System.out.println("sunday");
//             break;
//            }
//        }else{
//         System.out.println("Invalid Input");
//        }
        
//     }
// }
                // or 

// import java.util.*;

// public class Java {
//     public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
 // int weekNum = sc.nextInt();
//  switch (weekNum) {
//case 1 : System.out.println("Monday");
// break;
// case 2 : System.out.println("tuesday");
 // break;
// case 3 : System.out.println("wednesay");
//  break;
//  case 4 : System.out.println("thursday");
//  break;
//  case 5 : System.out.println("friday");
//  break;
//  case 6 : System.out.println("saturday");
//  break;
//  case 7 : System.out.println("sunday");
//  break;
//  default : System.out.println("invalid input");
//  }
//       }

// Question5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not

// import java.util.*;

// public class Java {
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//       if (num % 4 ==0) {
//         if (num % 100 == 0) {
//             if (num % 400 == 0) {
//                 System.out.println("this is a leap year");
//             }else {
//                 System.out.println("this is not a leap year");
//             }
//         }else {
//             System.out.println("this is a leap year");
//         }
//       }else{
//         System.out.println("this is not a  leap year");
//       }
        
//  }
//  } -->
