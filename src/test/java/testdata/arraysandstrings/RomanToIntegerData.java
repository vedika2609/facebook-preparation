package testdata.arraysandstrings;

import testdata.InputOutput;

import java.util.Collections;
import java.util.List;

public class RomanToIntegerData implements InputOutput {

    @Override
    public List<List<String>> getInputs() {
        return Collections.singletonList(Collections.singletonList("MCMXCIV"));
    }

    @Override
    public List<String> getOutputs() {
        return null;
    }
}
