package testdata;

import testdata.arraysandstrings.LongestSubstringWithoutRepetitionData;
import testdata.arraysandstrings.RomanToIntegerData;

public enum DataMap {
    //Arrays And Strings
    ROMAN_TO_INTEGER(new RomanToIntegerData()),
    LONGEST_SUBSTRING_WITHOUT_REPETITION(new LongestSubstringWithoutRepetitionData()),
    ;

    private InputOutput data;

    DataMap(InputOutput dataClass) {
        this.data = dataClass;
    }

    public InputOutput getData() {
        return data;
    }
}
