package executors.arraysandstrings;

import executors.Execute;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/interview/card/facebook/5/array-and-strings/3010/
 */

public class RomanToInteger implements Execute {

    private int romanToInt(String s){
        return 0;
    }


    @Override
    public List<String> execute(List<List<String>> input) {
        List<String> output = new ArrayList<>();
        input.forEach(it -> output.add(String.valueOf(romanToInt(it.get(0)))));
        return output;
    }
}
