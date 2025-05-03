import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            letters.put(s.charAt(i), letters.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!letters.containsKey(c) || letters.get(c) == 0) {
                return false;
            }
            letters.put(c, letters.get(c) - 1);
        }

        return true;
    }
}


/* we're given two strings
need to return true if first string is an anagram of second string
know that we can figure this problem out by using a hashmap

can use one loop for characters in s
can use one loop for characters in t

*/