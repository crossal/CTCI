package Chapter1;

import org.junit.Test;

import static Chapter1.Question4.encodeSpaces;
import static org.junit.Assert.*;

public class Question4Test {

    private String stringWithNoSpaces = "abcdef";
    private String stringWithSpaces = "abcd efgh  ";
    private String stringWithSpacesEncoded = "abcd%20efgh";
    private String stringWithConsecutiveSpaces = "abc def ghi  jklmn        ";
    private String stringWithConsecutiveSpacesEncoded = "abc%20def%20ghi%20%20jklmn";

    @Test
    public void encodeSpaces_onlySpaces_returnsInput() {
        assertEquals("  ", new String(encodeSpaces("  ".toCharArray())));
    }

    @Test
    public void encodeSpaces_emptyArray_returnsInput() {
        assertEquals("", new String(encodeSpaces("".toCharArray())));
    }

    @Test
    public void encodeSpaces_stringWithNoSpaces_isSuccessful() {
        assertEquals(stringWithNoSpaces, new String(encodeSpaces(stringWithNoSpaces.toCharArray())));
    }

    @Test
    public void encodeSpaces_stringWithSpaces_isSuccessful() {
        assertEquals(stringWithSpacesEncoded, new String(encodeSpaces(stringWithSpaces.toCharArray())));
    }

    @Test
    public void encodeSpaces_stringWithConsecutiveSpaces_isSuccessful() {
        assertEquals(stringWithConsecutiveSpacesEncoded, new String(encodeSpaces(stringWithConsecutiveSpaces.toCharArray())));
    }
}
