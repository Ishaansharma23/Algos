package Strings;

public class StrBuilder {
    public static void main(String[] args) {
        // Mutable = can change the same object.
        // String - Creates new String every time! , but StringBuilder - Changes same object
        StringBuilder sb = new StringBuilder(""); // started with empty string
        for(char ch = 'a'; ch < 'z'; ch++){
            sb.append(ch); // adds in the end 
        }
        System.out.println(sb);
    }
}
