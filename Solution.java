public class Solution {
    public static void main (String [] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(424242123));
        System.out.println(isPalindrome(821111128));
        System.out.println(isPalindrome(1000021));
    }

    public static boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        int len = string.length();

        for (int i = 0; i < len / 2; i++) {
            if (string.charAt(i) != string.charAt(len - 1 - i)) {
                return false; // Mismatch found
            }
        }

        return true; // All characters matched
    }
}

/* given integer x, if the integer is a palindrome meaning if it reads the same backwards as forwards, return true
for example 121 or 222 or 41114.

1: take integer, convert it to string
2: compare character at first with last, can see if it is the same using if statement
3: maybe we can loop for each char */