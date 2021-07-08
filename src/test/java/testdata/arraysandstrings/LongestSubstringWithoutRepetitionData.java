package testdata.arraysandstrings;

import utils.CreateInputOutputDataList;
import testdata.InputOutput;

import java.util.List;

public class LongestSubstringWithoutRepetitionData implements InputOutput {
    @Override
    public List<List<String>> getInputs() {
        return CreateInputOutputDataList.getLists("[{abcabcbb},{bbbbb},{pwwkew},{ },{}]");
    }

    @Override
    public List<String> getOutputs() {
        return CreateInputOutputDataList.getList("3,1,3,1,0");
    }
}
