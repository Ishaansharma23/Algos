package Strings;

public class Substring {
    public static String Substr(String str , int si , int ei) {
        String substr = "";
        for(int i = si; i < ei; i++ ){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        // inbuilt java Substring finding method
        System.out.println(str.substring(0, 4));
        System.out.println(Substr(str, 0, 5)); // 5 is not included

    }
}
