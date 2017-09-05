package Chapter01;

/**
 * Implement an algorithm to determine if a string has all unique characters. What
 * if you cannot use additional data structures? (Assume string is ASCII based.)
 **/

public class Q1 {

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};

        for (int i=0;i<words.length;i++) {
            if (isUnique(words[i])) {
                System.out.println(words[i] + " is a unique word.");
            }
            else {
                System.out.println(words[i] + " is not a unique word");
            }
        }
    }

    public static boolean isUnique(String s) {
        if (s == null || s.length() == 0 || s.length() > 256) {
            return false;
        }
        boolean[] charSet = new boolean[256];
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (charSet[c]) {
                return false;
            }
            charSet[c] = true;
        }
        return true;
    }
}
