package Strings;

public class LargestString {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "mango"};

        String largest = fruits[0];
        for(int i = 1; i < fruits.length; i++) { 
            if (largest.compareTo(fruits[i]) < 0 ) { // for largest str[0] < 0 ,  or isme (char) ka diff ata hai = mai to compare with 0
                largest = fruits[i]; // apple = 97,banana=98 so 97-98 = -1 hence < 0 , largest = banana 
            }
        }
        System.out.println(largest);
    }
}
    // banana = 98 , apple = 97 - 98-97= 1 not < 0  hence largest is banana only 

    // compareto()- compares char lexicographical order - "Apple" and "apple" are not equal — because 'A' (65) is different from 'a' (97).
    // comparetoIgnorecase() - Treats 'A' same as 'a'., So "Apple" and "apple" are equal when using compareToIgnoreCase.