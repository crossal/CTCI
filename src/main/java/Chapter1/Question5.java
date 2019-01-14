package Chapter1;

public class Question5 {

    public static String encodeString(String s) {

        if (s == null) {
            return null;
        }

        char[] chars = s.toCharArray();
        int i = 0;

        StringBuilder sb = new StringBuilder();
        while (i < chars.length) {
            char c = chars[i];
            int count = 1;
            boolean nextCharFound = false;
            boolean endOfString = false;
            while (!nextCharFound && !endOfString) {
                i++;
                if (i >= chars.length) {
                    endOfString = true;
                    sb.append(c + Integer.toString(count));
                } else {
                    char nextChar = chars[i];
                    if (c == nextChar) {
                        count++;
                    } else {
                        nextCharFound = true;
                        sb.append(c + Integer.toString(count));
                    }
                }
                if (sb.length() > s.length()) {
                    return s;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String words[] = {"aaaa", "aa", "a", "aabb", "aaaabbbbcccddeeee", "abcd"};
        for (String word : words) {
            System.out.println("encodeString(\"" + word + "\"): \"" + new String(encodeString(word)) + "\"");
        }
    }
}
