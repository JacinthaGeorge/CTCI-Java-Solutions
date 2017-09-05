package Chapter01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Implement a function which reverses a null terminated string
 **/

public class Q2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("Reverse of: " + s + " is: " + reverseString(s));
    }

    public static String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (int i=s.length()-1;i>=0;i--) {
            sb.append(String.valueOf(s.charAt(i)));
        }
        return sb.toString();
    }
}
