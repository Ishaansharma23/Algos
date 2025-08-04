package Strings;

public class StringCompress {
    public static String Compress(String str) {
        String result = ""; // isme store hogi compressed string

        for (int i = 0; i < str.length(); i++) {
            int count = 1; // count = 1 rhega kyuki a = 1 bar to hoga hi 

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) { // a = uska next letter bhi agr a hua to 
                count++; // count badha do 1 s 2 
                i++; // fir next letter pe chalo , a = 3 hai toh 3 bar chalega while loop 
            }

            result += str.charAt(i);  // Current letter dalo chahe 1 bar aya ho ya 3 bar 

            if (count > 1) {
                result += count;  // agr count 1 s jyada hai toh uske sth uska count b add krdo 
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "aaabbbcccddeee";
        String compressed = Compress(str);
        System.out.println(compressed);  // Output: a3b3c3d2e3
    }
}
