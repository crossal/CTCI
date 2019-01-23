package Chapter1;

import org.junit.Test;

import static Chapter1.Question3.areStringsPermutations;
import static org.junit.Assert.*;

public class Question3Test {

    private String string = "abcdef";
    private String differentString = "abcdefa";

    @Test
    public void areStringsPermutations_nullAString_returnsFalse() {
        assertFalse(areStringsPermutations(null, string));
    }

    @Test
    public void areStringsPermutations_nullBString_returnsFalse() {
        assertFalse(areStringsPermutations(string,null));
    }

    @Test
    public void areStringsPermutations_nullStrings_returnsFalse() {
        assertFalse(areStringsPermutations(null, null));
    }

    @Test
    public void areStringsPermutations_emptyStrings_returnsTrue() {
        assertTrue(areStringsPermutations("", ""));
    }

    @Test
    public void areStringsPermutations_notPermutations_returnsFalse() {
        assertFalse(areStringsPermutations(string, differentString));
    }

    @Test
    public void areStringsPermutations_arePermutations_returnsTrue() {
        assertTrue(areStringsPermutations(string, string));
    }
}
