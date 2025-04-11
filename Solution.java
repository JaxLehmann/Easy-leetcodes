import java.util.HashMap;

public class Solution {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = values.get(s.charAt(i));
            int next = 0;

            if (i + 1 < s.length()) {
                next = values.get(s.charAt(i + 1));
            }

            if (current >= next) {
                sum += current;
            } else {
                sum -= current;
            }
        }

        return sum;
    }

    public static void main (String [] args) {
        System.out.println(romanToInt("XVII"));
        System.out.println(romanToInt("II"));

    }
}





/* pseudo code
for i = 0 i is less than length of the string i increments ( this will just loop through the string like III
    if char at i (current value) is greater than or equal to char at next, add current value to the sum, then it'll
    loop to the next value and add that, so on so forth.
        else char at i (current value) is less than next, subtract current from next

    before establishing the (next) variable, keep in mind since i is 0, i.next is going to be out of bounds when
    looping through

    EX) Roman Numeral III:
    For i = 0, i is going to be 0, next will be 1.. so itll be 1 when i is 0
    Then when i is 1, i + i.next which is now 2 will be 3
    Then lastly, when i is 2, i.next will be 3 which is out of bounds!
    can declare next in the if statement where if i + 1 is < s.length and have int next = 0 for all other cases.
 */

