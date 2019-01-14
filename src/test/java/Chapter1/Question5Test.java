package Chapter1;

import org.junit.Test;

import static Chapter1.Question5.encodeString;
import static org.junit.Assert.*;

public class Question5Test {

    private String stringToEncode = "aaaabbbbcccddeeee";
    private String stringToEncodeEncoded = "a4b4c3d2e4";
    private String stringThatDoesntBenefitFromEncoding = "abcd";

    @Test
    public void encodeString_nullString_returnsNull() {
        assertNull(encodeString(null));
    }

    @Test
    public void encodeString_emptyString_returnsEmptyString() {
        assertEquals("", encodeString(""));
    }

    @Test
    public void encodeString_string_returnsEncodedString() {
        assertEquals(stringToEncodeEncoded, encodeString(stringToEncode));
    }

    @Test
    public void encodeString_stringThatDoesntBenefitFromEncoding_returnsOriginalString() {
        assertEquals(stringThatDoesntBenefitFromEncoding, encodeString(stringThatDoesntBenefitFromEncoding));
    }
}
