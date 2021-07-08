package testdata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.singletonList;

public enum ExecutableClasses {
    ROMAN_TO_INTEGER(singletonList(singletonList("MCMXCIV"))),
    LONGEST_SUBSTRING_WITHOUT_REPETITION(Arrays.asList(singletonList("abcabcbb"), singletonList("bbbbb"), singletonList("pwwkew"), singletonList(" "), singletonList(""))),
    ;

   private List<List<String>> label;

    ExecutableClasses(List<List<String>> label) {
        this.label = label;
    }

    public List<List<String>> getLabel() {
        return label;
    }
}
