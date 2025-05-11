import java.util.*;
public class RomanNumerals {
    public int romanToInt(String s) {
        HashMap <String, Integer> numerals = new HashMap<>();
        numerals.put("I", 1);
        numerals.put("V", 5);
        numerals.put("X", 10);
        numerals.put("L", 50);
        numerals.put("C", 100);
        numerals.put("D", 500);
        numerals.put("M", 1000);
        int sum = 0;

        ArrayList<Integer> valuesToAdd = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String currentChar = s.substring(i, i + 1);
            valuesToAdd.add(numerals.get(currentChar));
        }
        for (int i = 0; i < valuesToAdd.size(); i++) {
            if (i + 1 < valuesToAdd.size() && valuesToAdd.get(i) < valuesToAdd.get(i+1)) {
                sum += (valuesToAdd.get(i + 1) - valuesToAdd.get(i));
                i++;
            }

            else {sum += valuesToAdd.get(i);}
        }
        return sum;
    }
    public static void main(String [] args) {
            RomanNumerals sol = new RomanNumerals();

            System.out.println(sol.romanToInt("III"));      // 3 (1 + 1 + 1)
            System.out.println(sol.romanToInt("IV"));       // 4 (5 - 1)
            System.out.println(sol.romanToInt("IX"));       // 9 (10 - 1)
            System.out.println(sol.romanToInt("LVIII"));    // 58 (50 + 5 + 1 + 1 + 1)
            System.out.println(sol.romanToInt("MCMXCIV"));  // 1994 (1000 + 900 + 90 + 4)

    }
}
