package Chapter1;

public class Question4 {

    public static char[] encodeSpaces(char[] chars) {
        if (chars.length == 0) {
            return chars;
        }

        Integer lastValidCharacterIndex = null;
        int i = chars.length - 1;
        while (lastValidCharacterIndex == null && i >= 0) {
            if (chars[i] != ' ') {
                lastValidCharacterIndex = i;
            } else {
                i--;
            }
        }

        if (lastValidCharacterIndex != null && i < chars.length - 1) {
            int cursor = chars.length - 1;
            while (i >= 0) {
                char c = chars[i];
                if (c == ' ') {
                    chars[cursor] = '0';
                    cursor--;
                    chars[cursor] = '2';
                    cursor--;
                    chars[cursor] = '%';
                    cursor--;
                } else {
                    chars[cursor] = c;
                    cursor--;
                }
                i--;
            }
        }

        return chars;
    }

    public static void main(String[] args) {
        String words[] = {"abcdef", "abcd efgh  ", "abc def ghi  jklmn        "};
        for (String word : words) {
            System.out.println("encodeSpaces(\"" + word + "\"): \"" + new String(encodeSpaces(word.toCharArray())) + "\"");
        }
    }
}
