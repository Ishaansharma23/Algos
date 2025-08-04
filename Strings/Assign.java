// Question1: Count how many times lower case vowels occurred in a String entered by the user.
// Question 2 :Determine if 2 Strings are anagrams of each other
package Strings;

import java.util.Arrays;

public class Assign {
    public static int Count(String str) {
        int count = 0; // Initialize count for vowels

        for(int i = 0; i < str.length() ; i++){
            char ch = str.charAt(i); // Get the character at index i

            // Check if the character is a lowercase vowel
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; // Increment count if it is a vowel
            }

        }
        return count;
    }
   public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false; // if lengths differ, they can't be anagrams

    char[] a = s.toCharArray(); // characters ko array mai convert krdia 
    char[] b = t.toCharArray(); 
    Arrays.sort(a); // fir sort krdia 
    Arrays.sort(b); // ['e', 'i', 'l', 'n', 's', 't']

    return Arrays.equals(a, b); // equals checks the content in it to sahi hua to true nai false 
}


    public static void main(String[] args) {
        String str = "Hello, World! This is a test string with vowels.";
        int vowelCount = Count(str); // Call the Count method to get the number of vowels
        System.out.println("Number of lowercase vowels: " + vowelCount); // Print the count of vowels
        String s = "listen";
        String t = "silent";
        System.out.println(isAnagram(s, t));
    }
}
