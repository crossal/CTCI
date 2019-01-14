package Chapter1;

import java.util.HashMap;
import java.util.Map;

public class Question3 {

    public static boolean areStringsPermutations(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            Integer countFromMap = charCount.get(c);
            if (countFromMap == null) {
                countFromMap = 0;
            }
            charCount.put(c, countFromMap + 1);
        }

        for (int j = 0; j < b.length(); j++) {
            char c = b.charAt(j);
            Integer countFromMap = charCount.get(c);
            if (countFromMap == null) {
                return false;
            } else if (countFromMap == 1) {
                charCount.remove(c);
            } else {
                charCount.put(c, countFromMap - 1);
            }
        }

        if (charCount.keySet().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] aWords = {"abcde", "abcde"};
        String[] bWords = {"abcde", "abcdea"};
        for (int i = 0; i < aWords.length; i++) {
            String aWord = aWords[i];
            String bWord = bWords[i];
            System.out.println("areStringsPermutations(" + aWord + ", " + bWord + "): " + areStringsPermutations(aWord, bWord));
        }
    }
}
