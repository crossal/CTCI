package Chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question1 {

    public static boolean hasAllUniqueCharactersA(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String charAsString = s.substring(i, i + 1);
            Integer count = map.get(charAsString);
            if (count != null) {
                return false;
            } else {
                map.put(charAsString, 1);
            }
        }

        return true;
    }

    public static boolean hasAllUniqueCharactersA2(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < s.length() - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean hasAllUniqueCharactersUsingNoDataStructures(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcd", "abcad"};
        for (String word : words) {
            System.out.println(word + " hasAllUniqueCharactersA: " + hasAllUniqueCharactersA(word) + ", hasAllUniqueCharactersA2: " + hasAllUniqueCharactersA2(word) + ", hasAllUniqueCharactersUsingNoDataStructures: " + hasAllUniqueCharactersUsingNoDataStructures(word));
        }
    }
}
