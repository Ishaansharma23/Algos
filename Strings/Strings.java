package Strings;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // Strings are immutable - once created cannot be changed
        // Any operation that seems to “modify” a string actually creates a new String object.

        char arr[] = {'a', 'b', 'c'};
        String str = "abcd";
        String str1 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter name: ");
        name = sc.nextLine(); // next - one word without space, nextLine - whole line

        System.out.println("You entered: " + name);

        sc.close();
        System.out.println(arr);
        System.out.println(str + str1);

        // length 
        String ish = "ishaan sharma";
        System.out.println("\nThe length of this string is: " + ish.length()); // spaces count too

        // charAt() - char at every index
        for (int i = 0; i < ish.length(); i++) {
            System.out.print(ish.charAt(i) + " "); // i s h a a n   s h a r m a 
        }

        String s1 = "Tony";
        String s2 = "Tony"; // s1, s2 both are equal , as it refer to same memory location
        System.out.println(s2);
        String s3 = new String("Tony"); // is not equal to s1,s2 as it gives new space in memory,  creates a new tony

        // but String s3 and s1 can be equal or the content in it can be same , equal by 
        if (s1.equals(s3)) {
            System.out.println("Strings are equal ");
        }else{
            System.out.println("Strings are not equal "); // strings are equal 
        }
    }   //  interning - stack or heap hota hai like str1= tony wo chala gya heap mai then str2 = tony to wo naya nahi bnayega
    // str 2 will refer to same memory location as str1 so str1,str2 dono reference hai jo point kr re hai tony ko in heap
    // but str3 = new String("tony") to yeh naya memory location bn
}
