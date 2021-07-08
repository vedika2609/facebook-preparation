package tests;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;

import java.util.Collections;
import java.util.List;

public class TestAssertion {
    void assertOutputs(List<String> expected, List<String> actual){
        if(expected.equals(actual))
            return;
        Assertions.assertThat(actual.size()).isEqualTo(expected.size()).describedAs("Output size mismatch");

        Collections.sort(expected);
        Collections.sort(actual);

        SoftAssertions assertions = new SoftAssertions();
        for(int i=0; i<expected.size(); i++){
            String errorMsg = String.format("Expected: %s; Actual: %s", expected.get(i), actual.get(i));
            assertions.assertThat(actual.get(i)).isEqualTo(expected.get(i)).describedAs(errorMsg);
        }
        assertions.assertAll();
    }
}
