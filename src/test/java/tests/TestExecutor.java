package tests;

import arraysandstrings.LongestSubstringWithoutRepetition;
import arraysandstrings.RomanToInteger;
import testdata.DataMap;

import java.util.ArrayList;
import java.util.List;

public class TestExecutor {

    public void executor(DataMap executableClass){
        List<String> outputList = new ArrayList<>();
        switch (executableClass) {
            case ROMAN_TO_INTEGER:
                executableClass.getData().getInputs().forEach(input -> outputList.add(String.valueOf(new RomanToInteger().romanToInt(input.get(0)))));
                break;
            case LONGEST_SUBSTRING_WITHOUT_REPETITION:
                executableClass.getData().getInputs().forEach(input -> outputList.add(String.valueOf(new LongestSubstringWithoutRepetition().lengthOfLongestSubstring(input.get(0)))));
                break;
        }
        new TestAssertion().assertOutputs(executableClass.getData().getOutputs(), outputList);
    }
}
