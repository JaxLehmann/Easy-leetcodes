import java.util.Stack;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String tracker = s.toLowerCase();
        Stack <Character> stack = new Stack<>();
        StringBuilder forward = new StringBuilder();

        for (int i = 0; i < tracker.length(); i++) {
            char c = tracker.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(c);
                forward.append(c);
            }
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        if (reversed.toString().equals(forward.toString())) return true;
        else return false;

    }
    public static void main (String [] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("AbBa"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }
}

/* Need to convert all letters to lowercase
Reads same backwards as forward, like racecar
Can do this by using a stack.
If we take all the letters and pop them 1 by one, such as abba
we pop a, pop b, pop b, pop a
"abba" then compare that to the initial string s, if theyre equal, we have a palindrome
*/

/* Need to convert all letters to lowercase
Reads same backwards as forward, like racecar
Can do this by using a stack.
If we take all the letters and pop them 1 by one, such as abba
we pop a, pop b, pop b, pop a
"abba" then compare that to the initial string s, if theyre equal, we have a palindrome
*/