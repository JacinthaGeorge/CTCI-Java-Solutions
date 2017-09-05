package Chapter01;

/**
 * Write a method to replace all spaces in a string with'%20'. You may assume that
 * the string has sufficient space at the end of the string to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform this
 * operation in place.)
 * EXAMPLE
 * Input:  "Mr John Smith    "
 * Output: "Mr%20John%20Smith"
 */

public class Q4 {

    public static void main(String[] args) throws Exception {
        char[] str = {'a','b',' ','c',' ','d','\0','\0','\0','\0','\0','\0','\0'};
        replaceSpace(str, 6);
        printArr(str);
    }

    public static void replaceSpace(char[] arr, int l) {
        int cnt = 0;
        for (char c: arr) {
            if (c == ' ') {
                cnt++;
            }
        }
        int p = l + 2*cnt;
        arr[p] = '\0';
        --p;
        for (int i=l-1;i>=0;--i) {
            if (arr[i] == ' ') {
                arr[p--] = '0';
                arr[p--] = '2';
                arr[p--] = '%';
            }
            else {
                arr[p--] = arr[i];
            }
        }
    }

    public static void printArr(char[] arr) {
        for (char c: arr) {
            System.out.print(c);
        }
    }
}