import java.util.HashMap;
import java.util.Map;
public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        HashMap <Character, Integer> characterCount = new HashMap<>();

        for (char ch : s.toCharArray()) {
            characterCount.put(ch, characterCount.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (characterCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }


        return -1;
    }

    public static void main(String [] args) {
        System.out.println(new FirstUniqueChar().firstUniqChar("leetcode"));
        System.out.println(new FirstUniqueChar().firstUniqChar("loveleetcode"));
        System.out.println(new FirstUniqueChar().firstUniqChar("aabb"));
    }
}

/* given string, find first NON REPEATING character in it, return the index.
ex: leetcode, l is the FIRST NON REPEATING CHARACTER in the string.
in loveleetcode, index 2 shows V, all the other characters repeat
can solve by using a hashmap, add all the keys (letters) to a value (index)
if the key of the character does not show up again ( == 1), return that index
*/