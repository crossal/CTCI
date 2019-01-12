package Chapter1;

import org.junit.*;

import static Chapter1.Question1.*;
import static org.junit.Assert.*;

public class Question1Test {

    private String stringWithUniqueChars = "abcdefg";
    private String shortStringWithUniqueChars = "ab";
    private String stringWithNonUniqueCharAtBeginning = "aabcdefg";
    private String stringWithNonUniqueCharInMiddle = "abcdaefg";
    private String stringWithNonUniqueCharAtEnd = "abcdefa";
    private String shortStringWithNonUniqueChar = "aa";

    //region Test hasAllUniqueCharactersBruteForce
    @Test
    public void hasAllUniqueCharactersA_uniqueChars_returnsTrue() {
        assertTrue(hasAllUniqueCharactersA(stringWithUniqueChars));
    }

    @Test
    public void hasAllUniqueCharactersA_uniqueCharsShortString_returnsTrue() {
        assertTrue(hasAllUniqueCharactersA(shortStringWithUniqueChars));
    }

    @Test
    public void hasAllUniqueCharactersA_nonUniqueCharAtBeginning_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA(stringWithNonUniqueCharAtBeginning));
    }

    @Test
    public void hasAllUniqueCharactersA_nonUniqueCharInMiddle_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA(stringWithNonUniqueCharInMiddle));
    }

    @Test
    public void hasAllUniqueCharactersA_nonUniqueCharAtEnd_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA(stringWithNonUniqueCharAtEnd));
    }

    @Test
    public void hasAllUniqueCharactersA_nonUniqueCharsShortString_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA(shortStringWithNonUniqueChar));
    }

    @Test
    public void hasAllUniqueCharactersA_nullString_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA(null));
    }

    @Test
    public void hasAllUniqueCharactersA_emptyString_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA(""));
    }
    //endregion

    //region Test hasAllUniqueCharactersA
    @Test
    public void hasAllUniqueCharactersA2_uniqueChars_returnsTrue() {
        assertTrue(hasAllUniqueCharactersA2(stringWithUniqueChars));
    }

    @Test
    public void hasAllUniqueCharactersA2_uniqueCharsShortString_returnsTrue() {
        assertTrue(hasAllUniqueCharactersA2(shortStringWithUniqueChars));
    }

    @Test
    public void hasAllUniqueCharactersA2_nonUniqueCharAtBeginning_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA2(stringWithNonUniqueCharAtBeginning));
    }

    @Test
    public void hasAllUniqueCharactersA2_nonUniqueCharInMiddle_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA2(stringWithNonUniqueCharInMiddle));
    }

    @Test
    public void hasAllUniqueCharactersA2_nonUniqueCharAtEnd_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA2(stringWithNonUniqueCharAtEnd));
    }

    @Test
    public void hasAllUniqueCharactersA2_nonUniqueCharsShortString_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA2(shortStringWithNonUniqueChar));
    }

    @Test
    public void hasAllUniqueCharactersA2_nullString_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA2(null));
    }

    @Test
    public void hasAllUniqueCharactersA2_emptyString_returnsFalse() {
        assertFalse(hasAllUniqueCharactersA2(""));
    }
    //endregion

    //region Test hasAllUniqueCharactersUsingNoDataStructures
    @Test
    public void hasAllUniqueCharactersUsingNoDataStructures_uniqueChars_returnsTrue() {
        assertTrue(hasAllUniqueCharactersUsingNoDataStructures(stringWithUniqueChars));
    }

    @Test
    public void hasAllUniqueCharactersUsingNoDataStructures_uniqueCharsShortString_returnsTrue() {
        assertTrue(hasAllUniqueCharactersUsingNoDataStructures(shortStringWithUniqueChars));
    }

    @Test
    public void hasAllUniqueCharactersUsingNoDataStructures_nonUniqueCharAtBeginning_returnsFalse() {
        assertFalse(hasAllUniqueCharactersUsingNoDataStructures(stringWithNonUniqueCharAtBeginning));
    }

    @Test
    public void hasAllUniqueCharactersUsingNoDataStructures_nonUniqueCharInMiddle_returnsFalse() {
        assertFalse(hasAllUniqueCharactersUsingNoDataStructures(stringWithNonUniqueCharInMiddle));
    }

    @Test
    public void hasAllUniqueCharactersUsingNoDataStructures_nonUniqueCharAtEnd_returnsFalse() {
        assertFalse(hasAllUniqueCharactersUsingNoDataStructures(stringWithNonUniqueCharAtEnd));
    }

    @Test
    public void hasAllUniqueCharactersUsingNoDataStructures_nonUniqueCharsShortString_returnsFalse() {
        assertFalse(hasAllUniqueCharactersUsingNoDataStructures(shortStringWithNonUniqueChar));
    }

    @Test
    public void hasAllUniqueCharactersUsingNoDataStructures_nullString_returnsFalse() {
        assertFalse(hasAllUniqueCharactersUsingNoDataStructures(null));
    }

    @Test
    public void hasAllUniqueCharactersUsingNoDataStructures_emptyString_returnsFalse() {
        assertFalse(hasAllUniqueCharactersUsingNoDataStructures(""));
    }
    //endregion
}
