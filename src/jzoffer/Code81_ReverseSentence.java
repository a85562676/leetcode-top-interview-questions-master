package jzoffer;

public class Code81_ReverseSentence {

    public static String ReverseSentence(String str) {
        char[] a = str.toCharArray();
        reverse(a, 0, a.length - 1);
        reverseWord(a);
        return new String(a).toString();
    }

    public static void reverse(char[] a, int left, int right) {
        while (left < right) {
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    public static void reverseWord(char[] a) {
        int left = 0;
        int right = 0;
        while (left < a.length) {
            if (a[left] == ' ') {
                left++;
                right++;
            } else if (right == a.length || a[right] == ' ') {
                reverse(a, left, --right);
                left = ++right;
            } else {
                right++;
            }
        }
    }

    public static void main(String[] args) {
        String str = "I am a student.";
        String s = ReverseSentence(str);
        System.out.println(s);
    }
}
