package utils;

import java.util.Collections;
import java.util.List;

public enum ExecutableClasses {
    ROMAN_TO_INTEGER(Collections.singletonList(Collections.singletonList("MCMXCIV")))
    ;

   private List<List<String>> label;

    ExecutableClasses(List<List<String>> label) {
        this.label = label;
    }

    public List<List<String>> getLabel() {
        return label;
    }
}
