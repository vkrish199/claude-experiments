package dsa.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> occuranceMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            occuranceMap.merge(s.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            Integer count = occuranceMap.get(c);
            if (count == null || count == 0) return false;
            occuranceMap.put(c, count - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        test("anagram", "nagaram", true);
        test("rat", "car", false);
        test("a", "a", true);
        test("ab", "a", false);
    }

    private static void test(String s, String t, boolean expected) {
        boolean result = isAnagram(s, t);
        boolean pass = result == expected;
        System.out.printf("s=%s t=%s -> got=%b expected=%b [%s]%n",
                s, t, result, expected, pass ? "PASS" : "FAIL");
    }
}
