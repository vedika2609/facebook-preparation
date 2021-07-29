package executors.arraysandstrings;

import executors.Execute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/explore/interview/card/facebook/5/array-and-strings/3008/
 */

public class LongestSubstringWithoutRepetition implements Execute {

    //O(n)2
    /*public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty())
            return 0;
        if(s.length() == 1)
            return 1;
        List<Character> list;
        int maxLength = 0;
        for (int i=0; i<s.length(); i++){
            list = new ArrayList<>();
            for (int j=i; j<s.length(); j++) {
                if(!list.contains(s.charAt(j))) {
                    list.add(s.charAt(j));
                    maxLength = Math.max(maxLength, list.size());
                } else
                    break;
            }
        }
        return maxLength;
    }*/

    // O(n)
    private int lengthOfLongestSubstring(String s) {
        int output = 0;
        int startIndex = 0;

        int[] index = new int[256];
        Arrays.fill(index, -1);

        for(int i=0; i<s.length(); i++){
            startIndex = Math.max(startIndex, index[s.charAt(i)] + 1);
            output = Math.max(output, i-startIndex+1);
            index[s.charAt(i)] = i;
        }
        return output;
    }

    @Override
    public List<String> execute(List<List<String>> input) {
        List<String> output = new ArrayList<>();
        input.forEach(it -> output.add(String.valueOf(lengthOfLongestSubstring(it.get(0)))));
        return output;
    }
}
