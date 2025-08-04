package Strings;

public class ToUppercase {
    public static String UpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        // Capitalize the first letter
        char ch = Character.toUpperCase(str.charAt(0)); //Character ek class hai Java mein jo characters ke saath kaam karne ke liye methods deti hai — jaise:
        //  // Character.isLetter(),
        sb.append(ch); // pehle char ko uppercase kr dia 

        for (int i = 1; i < str.length(); i++) { // 
            if (str.charAt(i) == ' ' && i < str.length() - 1) { // agr curr ch = space hai toh 
                sb.append(str.charAt(i)); // space dalo append kro 
                i++; // fir next ch pr jao space k bad wale m
                sb.append(Character.toUpperCase(str.charAt(i))); // or usko capital krdo 
            } else {
                sb.append(str.charAt(i)); // agr space nahi hai toh usi ch ko append krdo
            }
        }

        return sb.toString(); // as stringbuilder is obj toh to conv string we use .tostring
    }

    public static void main(String[] args) {
        String str = "hi, i am ishaan sharma";
        String result = UpperCase(str);
        System.out.println(result); // Output: Hi, I Am Ishaan Sharma
    }
}
