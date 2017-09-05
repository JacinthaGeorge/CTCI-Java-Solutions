package Chapter01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * (Assume comparison is case-sensitive, space-significant, ASCII-based.)
 */

public class Q3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        System.out.println("Is " + s1 + " a permutation of " + s2 + ": " + isPerm(s1, s2));
    }

    public static boolean isPerm(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return true;
        }
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charArr = new int[256];
        for (int i=0;i<s1.length();i++) {
            charArr[s1.charAt(i)]++;
        }

        for (int i=0;i<s2.length();i++) {
            charArr[s2.charAt(i)]--;
            if (charArr[s2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
}