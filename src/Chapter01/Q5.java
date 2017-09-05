package Chapter01;

/**
 * Implement a method to perform basic string compression using the counts of
 * repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string.
 */

public class Q5 {

    public static void main(String[] args) throws Exception {
        String inp = "aabcccccaaa";
        String shortString = shortenString(inp);
        String ans = shortString.length() < inp.length() ? shortString : inp;
        System.out.println(ans);
    }

    public static String shortenString(String inp) {
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for (int i=0;i<inp.length();i++) {
            if (i != inp.length()-1 && inp.charAt(i) == inp.charAt(i+1)) {
                count++;
            }
            else {
                sb.append(String.valueOf(inp.charAt(i)));
                sb.append(String.valueOf(count));
                count=1;
            }
        }
        return sb.toString();
    }
}