package jzoffer;

public class Code82_LeftRotateString {

    public static String LeftRotateString(String str,int n) {
        if (str == null || str.length() == 0 || n < 0 || n > str.length()) {
            return "";
        }
        char[] strChar = str.toCharArray();
        reverse(strChar, 0, n - 1);
        reverse(strChar, n, strChar.length - 1);
        reverse(strChar, 0, strChar.length - 1);
        return String.valueOf(strChar);

    }
    public static void reverse(char[] data, int start, int end) {
        if (data == null || start >= end) {
            return;
        }
        while (start < end) {
            char temp = data[start];
            data[start] = data[end];
            data[end] = temp;
            start++;
            end--;
        }
        return;
    }

    public static void main(String[] args) {
        String str = LeftRotateString("abcdefg", 2);
        System.out.println(str);

    }
}
